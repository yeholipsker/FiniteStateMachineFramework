package States;

import Events.Event;
import FiniteStateMachineFramework.State.State;

public class SeenBOnce extends State {

    private static SeenBOnce seenBOnce = null;

    public static SeenBOnce getInstance() {
        if (seenBOnce == null) {
            seenBOnce = new SeenBOnce();
        }
        return seenBOnce;
    }

    private SeenBOnce() {
    }

    @Override
    public State transition(Event event) {
        switch (event.getType()) {
            case TYPE_A:
                return SeenAOnce.getInstance();
            case TYPE_B:
                return SeenBTwice.getInstance();
            default:
                return null;
        }
    }
}
