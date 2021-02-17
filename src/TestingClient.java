import Events.Event;
import Events.TypeBEvent;
import Events.TypeAEvent;
import Machines.FiniteStateMachine;
import States.InitialState;
import States.State;

public class TestingClient {
    public static void main(String[] args) {
        State initialState = InitialState.getInstance();
        FiniteStateMachine finiteStateMachine = new FiniteStateMachine(initialState);
        Event event = new TypeAEvent();
        finiteStateMachine.raiseEvent(event);
        Event event2 = new TypeBEvent();
        finiteStateMachine.raiseEvent(event2);
    }
}
