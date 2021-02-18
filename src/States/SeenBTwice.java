package States;

import Events.Event;
import FiniteStateMachineFramework.State.State;

public class SeenBTwice extends State {
    private static SeenBTwice seenBTwice = null;

    public static SeenBTwice getInstance() {
        if (seenBTwice == null) {
            seenBTwice = new SeenBTwice();
        }
        return seenBTwice;
    }

    private SeenBTwice() {
    }

    @Override
    public State transition(Event event) {
        switch (event.getType()) {
            case TYPE_A:
                return SeenAOnce.getInstance();
            case TYPE_B:
                return ThreeInRow.getInstance();
            default:
                return null;
        }
    }
}
