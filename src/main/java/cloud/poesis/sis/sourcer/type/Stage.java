package cloud.poesis.sis.sourcer.type;

/**
 * The 3 stages of the sourcing DAG.
 *
 * <p>Stages map 1-1 to the 3 blackboard panels declared in {@code def/components.puml}:
 *
 * <ul>
 *   <li>{@link #IDENTIFICATION} writes {@code sis:Definition.*Identity}
 *   <li>{@link #ARCHETYPING} writes {@code sis:Archetype.*Archetype}
 *   <li>{@link #STATEMENT} writes {@code sis:Statement.*Statement}
 * </ul>
 */
public enum Stage {
  IDENTIFICATION("sis:Definition", "Identity"),
  ARCHETYPING("sis:Archetype", "Archetype"),
  STATEMENT("sis:Statement", "Statement");

  private final String panel;
  private final String slotSuffix;

  Stage(String panel, String slotSuffix) {
    this.panel = panel;
    this.slotSuffix = slotSuffix;
  }

  public String panel() {
    return panel;
  }

  public String slotSuffix() {
    return slotSuffix;
  }
}
