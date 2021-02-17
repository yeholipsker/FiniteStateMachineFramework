package States;

import Events.Event;

public class SeenATwice extends State{
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
                return threeInRow.getInstance();
            case TYPE_B:
                return InitialState.getInstance();
            default:
                return null;
        }
    }
}
