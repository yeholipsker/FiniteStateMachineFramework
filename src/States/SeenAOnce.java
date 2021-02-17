package States;

import Events.Event;

public class SeenAOnce extends State {

    private static SeenAOnce seenAOnce = null;

    public static SeenAOnce getInstance() {
        if (seenAOnce == null) {
            seenAOnce = new SeenAOnce();
        }
        return seenAOnce;
    }

    private SeenAOnce() {
    }

    @Override
    public State transition(Event event) {
        switch (event.getType()) {
            case TYPE_A:
                return SeenATwice.getInstance();
            case TYPE_B:
                return InitialState.getInstance();
            default:
                return null;
        }
    }
}
