package States;

import FiniteStateMachineFramework.Event.Event;
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
        this.id = this.getClass().getName();
    }

    @Override
    public State handle(Event event) {
        return this;
    }
}
