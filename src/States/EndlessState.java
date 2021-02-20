package States;

import FiniteStateMachineFramework.Event.Event;
import FiniteStateMachineFramework.State.State;

/**
 * State for the situation our machine already encountered 3 events of the same type
 */
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

    /**
     * our machine already encountered 3 events of the same type so we can stay in
     * this State forever
     * @param event to be handled
     * @return this state(itself)
     */
    @Override
    public State handle(Event event) {
        return this;
    }
}
