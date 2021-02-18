package Machines;

import FiniteStateMachineFramework.Machine.FiniteStateMachine;
import States.InitialState;
import States.ThreeInRowStateFactory;

public class ThreeInRowMachine extends FiniteStateMachine {
    public ThreeInRowMachine() {
        super();
        this.stateFactory = new ThreeInRowStateFactory();
        this.state = InitialState.getInstance();
    }
}
