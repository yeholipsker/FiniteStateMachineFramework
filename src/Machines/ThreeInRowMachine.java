package Machines;

import FiniteStateMachineFramework.Machine.FiniteStateMachine;
import States.InitialState;
import States.ThreeInRowStateSerializer;

public class ThreeInRowMachine extends FiniteStateMachine {
    public ThreeInRowMachine() {
        super(InitialState.getInstance(), new ThreeInRowStateSerializer());
        System.out.println("current state is - " + this.state.getId());
    }
}
