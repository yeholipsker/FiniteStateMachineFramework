import Events.Event;
import Events.TypeBEvent;
import Events.TypeAEvent;
import Machines.FiniteStateMachine;
import Machines.ThreeInRowMachine;
import States.InitialState;
import States.State;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingClient {
    public static void main(String[] args) {
        FiniteStateMachine finiteStateMachine = new ThreeInRowMachine();
        Event event1 = new TypeAEvent();
        Event event2 = new TypeBEvent();
        List<Event> eventList = new ArrayList<>(Arrays.asList(
                event1,
                event2,
                event1,
                event1,
                event2,
                event2,
                event2,
                event1,
                event1,
                event1,
                event2
        ));
        for (Event event : eventList) {
            finiteStateMachine.raiseEvent(event);
        }
    }
}
