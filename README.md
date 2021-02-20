# FiniteStateMachineFramework

This is a framework and example for creating Finite State Machines.

The Framework itself is in FiniteStateMachineFramework package.
It contains abstract classes for Events, States and Finite state machine, 
and also IStateSerializer interface.

In order to create new finite state machine using this framework, you need to -
  1. extend Event class with the events your machine can interact - initialize id in constructor.
  2. extend State class with the states your machine can have -  - initialize id in constructor 
     and implement "handle(Event event)" method for returning the next state.
  3. implement IStateSerializer, so the machine can save its state and continue from where
     it left.
  4. extend FiniteStateMachine class and give the super constructor its initial state and 
     your specific implementation for IStateSerializer.

In the example I created simple finite state machine that has two types of events, and the
machine print "Three identical events occurred!" message to the console the first time 
it receives 3 consecutive events of the same type.(TestingClient.java).

I also demonstrated the ability of the machine to save its its state and continue from where
it left.(TestSave.java, TestLoad.java).
