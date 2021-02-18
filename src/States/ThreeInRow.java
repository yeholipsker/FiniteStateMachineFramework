package States;

import Events.Event;
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
    }

    @Override
    public State transition(Event event) {
        System.out.println("Three identical events occurred!");
        return EndlessState.getInstance();
    }
}
