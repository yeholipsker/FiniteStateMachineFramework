package States;

import Events.Event;
import Events.TypeBEvent;
import FiniteStateMachineFramework.State.State;

public class SeenATwice extends State {
    private static SeenATwice seenATwice = null;

    public static SeenATwice getInstance() {
        if (seenATwice == null) {
            seenATwice = new SeenATwice();
        }
        return seenATwice;
    }

    private SeenATwice() {
    }

    @Override
    public State transition(Event event) {
        switch (event.getType()) {
            case TYPE_A:
                return ThreeInRow.getInstance();
            case TYPE_B:
                return SeenBOnce.getInstance();
            default:
                return null;
        }
    }

}
