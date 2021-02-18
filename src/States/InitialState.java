package States;

import Events.Event;
import FiniteStateMachineFramework.State.State;

public class InitialState extends State {

    private static InitialState initialState = null;

    public static InitialState getInstance() {
        if (initialState == null) {
            initialState = new InitialState();
        }
        return initialState;
    }

    private InitialState() {
    }

    @Override
    public State transition(Event event) {
        switch (event.getType()) {
            case TYPE_A:
                return SeenAOnce.getInstance();
            case TYPE_B:
                return SeenBOnce.getInstance();
            default:
                return null;
        }
    }
}
