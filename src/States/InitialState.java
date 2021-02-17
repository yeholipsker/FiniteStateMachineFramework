package States;

import Events.Event;
import Events.EventType;

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
        if (event.getType().equals(EventType.TYPE_A)) {
            return SeenAOnce.getInstance();
        }

        if (event.getType().equals(EventType.TYPE_B)) {
            return SeenBOnce.getInstance();
        }
        return null;
    }
}
