package cloud.poesis.sis.sourcer.dto;

/**
 * Response returned synchronously after a sourcing run is accepted.
 *
 * @param runId opaque sourcer-side run identifier
 * @param blackboardId target Blackboard receiving the contributions
 */
public record RunSourcingResponse(String runId, String blackboardId) {}
