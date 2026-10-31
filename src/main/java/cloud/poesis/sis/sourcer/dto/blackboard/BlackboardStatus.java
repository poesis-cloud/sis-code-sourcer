package cloud.poesis.sis.sourcer.dto.blackboard;

/**
 * Server-owned Blackboard lifecycle state.
 *
 * <p>Mirrors {@code BlackboardStatus} from {@code
 * sis/sis-blackboard-manager/def/blackboard/blackboard.puml}.
 */
public enum BlackboardStatus {
  OPEN,
  SEALING,
  SEALED,
  ABORTED
}
