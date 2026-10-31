# SIS Code Sourcer — deployables

This folder contains ops/runtime assets for the sourcer client process.

- `ops/helm/`: Helm chart for Kubernetes deployments (dev/preprod/prod)

## Helm

Chart path: `ops/helm`

Environment values:

- `environments/dev/values.yaml`
- `environments/preprod/values.yaml`
- `environments/prod/values.yaml`

Each environment file is self-contained and carries the chart defaults for that target environment.

Recommended deploy command:

```bash
helm upgrade --install sis-code-sourcer \
  sis/sis-code-sourcer/ops/helm \
  -n sis --create-namespace \
  -f sis/sis-code-sourcer/ops/helm/environments/preprod/values.yaml \
  --set-string secrets.OAUTH2_CLIENT_SECRET="$OAUTH2_CLIENT_SECRET"
```

Secrets policy:

- Never commit production secrets in values files.
- Inject secrets at deploy time (`--set-string`) or from a cluster secret manager.
- The chart requires `secrets.OAUTH2_CLIENT_SECRET` explicitly.

Schema validation:

- Validate before deploy:

```bash
helm lint sis/sis-code-sourcer/ops/helm \
  -f sis/sis-code-sourcer/ops/helm/environments/preprod/values.yaml \
  --set-string secrets.OAUTH2_CLIENT_SECRET=dummy
```

## Local dev

Run the sourcer locally (talks to a Blackboard Manager reachable at `BLACKBOARD_BASE_URL`):

```bash
cd sis/sis-code-sourcer && make run-api
```

`make dev-up` performs an in-cluster install of the sourcer using `environments/dev/values.yaml`. Bringing up its
upstream dependency (the Blackboard Manager and its own deps) is owned by that repo's `dev-up`.
