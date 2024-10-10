# **Real-World Problem Example with Solution**

## **Problem: Implementing an ATM Machine's States**

**Scenario:**
You are tasked with developing an ATM machine. The ATM has the following states:

1. **Idle**: The ATM is waiting for a user to insert a card.
2. **HasCard**: The ATM has a card inserted, and it's waiting for the user to enter the PIN.
3. **Authorized**: The user has entered the correct PIN, and now they can perform transactions (e.g., withdraw money).
4. **OutOfService**: If the ATM runs out of money, it enters the "Out of Service" state.

## **Requirements:**

- When a card is inserted, the ATM transitions from the Idle state to the HasCard state.
- After the user enters the correct PIN, the ATM transitions to the Authorized state.
- After a successful withdrawal, the ATM should deduct money and return to the Idle state, but if there's insufficient money, it should go into the OutOfService state.
- If the user cancels the transaction at any point, the ATM should return to the Idle state.

## S**olution Using the State Pattern**

The ATM's behavior varies depending on its state. We'll break the problem down into the State Pattern components:

- **Context**: The ATM itself will act as the Context, holding the current state.
- **State Interface**: The ATMState interface will define common behaviors (insert card, enter PIN, withdraw money).
- **Concrete States**: There will be concrete states like IdleState, HasCardState, AuthorizedState, and OutOfServiceState.