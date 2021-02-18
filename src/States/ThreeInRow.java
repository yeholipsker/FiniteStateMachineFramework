package States;

import Events.Event;
import Events.EventType;

public class ThreeInRow extends State{
    private static ThreeInRow threeInRow = null;

    public static ThreeInRow getInstance() {
        if (threeInRow == null) {
            threeInRow = new ThreeInRow();
        }
        return threeInRow;
    }

    private ThreeInRow() {
        System.out.println("Three identical events occurred!");
    }

    @Override
    public State transition(Event event) {
        return this;
    }
}
