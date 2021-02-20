package States;

import FiniteStateMachineFramework.Event.Event;
import FiniteStateMachineFramework.State.State;

/**
 * State for the situation our machine encounters 3 events of the same type for the first time
 */
public class ThreeInRow extends State {
    private static ThreeInRow threeInRow = null;

    public static ThreeInRow getInstance() {
        if (threeInRow == null) {
            threeInRow = new ThreeInRow();
        }
        return threeInRow;
    }

    private ThreeInRow() {
        this.id = this.getClass().getName();
    }

    /**
     * indicate our machine encounters 3 events of the same type for the first time and continue to
     * a state where we don't care what is the type of the event(EndlessState)
     * @param event to be handled
     * @return
     */
    @Override
    public State handle(Event event) {
        System.out.println("Three identical events occurred consecutively!");
        return EndlessState.getInstance();
    }
}
