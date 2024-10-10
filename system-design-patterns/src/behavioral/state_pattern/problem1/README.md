# **Java Code Example of the State Pattern**

## **Problem: Implementing a Vending Machine with Multiple States**

## **Components:**

- **Context**: The vending machine (VendingMachine) that interacts with the user and maintains its current state.
- **State Interface**: The VendingMachineState interface that defines the behavior for all states.
- **Concrete States**: The different states of the vending machine (IdleState, WaitingForSelectionState, DispensingState, OutOfStockState).

## **Step-by-Step Implementation**
1. **VendingMachineState Interface (State Interface)**
   This interface defines the common behavior for all states. Each state (Idle, Waiting for Selection, etc.) will implement this interface to provide specific behavior.

2. **VendingMachine Class (Context)**
   The Context class maintains a reference to the current state and delegates behavior to the state. 
 - The VendingMachine starts in the Idle state.
 - It holds a reference to the current state and delegates the behavior (like inserting money or selecting a product) to the current state.

3. **Concrete States**
   IdleState (Waiting for money)
   This state represents when the vending machine is waiting for money to be inserted.
   - In the IdleState, the machine waits for money. Once money is inserted, it transitions to the WaitingForSelectionState.
   - If the user tries to select a product before inserting money, the machine prompts them to insert money first.

- **WaitingForSelectionState (Waiting for product selection)**
This state represents when the vending machine is waiting for the user to select a product after money has been inserted.
  - In the WaitingForSelectionState, after the user inserts money, the machine waits for them to select a product.
  - After selecting a product, the state changes to DispensingState.

- **DispensingState (Dispensing the product)**
  This state represents the vending machine dispensing the product.
  - The DispensingState handles the dispensing of the product and updates the product count.
  - After dispensing, if there are products left, it goes back to IdleState; if not, it transitions to OutOfStockState.

- **OutOfStockState (No products left)**
This state represents when the vending machine has no products left.
  - The OutOfStockState handles the case where there are no more products in the machine. It prevents further interactions.

4. **Main Class (Testing the State Pattern)**
   Here’s the Main class to simulate how the vending machine transitions between states: