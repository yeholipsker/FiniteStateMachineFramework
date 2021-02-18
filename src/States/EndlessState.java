package States;

import Events.Event;
import FiniteStateMachineFramework.State.State;

public class EndlessState extends State {
    private static EndlessState endlessState = null;

    public static EndlessState getInstance() {
        if (endlessState == null) {
            endlessState = new EndlessState();
        }
        return endlessState;
    }

    private EndlessState() {
    }

    @Override
    public State transition(Event event) {
        return this;
    }
}
