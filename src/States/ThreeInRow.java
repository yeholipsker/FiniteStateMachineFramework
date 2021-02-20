package States;

import FiniteStateMachineFramework.Event.Event;
import FiniteStateMachineFramework.State.State;

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

    @Override
    public State handle(Event event) {
        System.out.println("Three identical events occurred!");
        return EndlessState.getInstance();
    }
}
