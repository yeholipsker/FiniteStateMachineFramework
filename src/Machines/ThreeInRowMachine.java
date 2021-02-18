package Machines;

import States.InitialState;

public class ThreeInRowMachine extends FiniteStateMachine {
    public ThreeInRowMachine() {
        this.state = InitialState.getInstance();
        System.out.println("new state is " + this.state.getClass().getName());
    }
}
