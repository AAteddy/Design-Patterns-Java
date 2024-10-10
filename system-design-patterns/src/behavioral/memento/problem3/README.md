# **Real-World Problem for You to Solve**

## **Problem: Implement Undo Functionality for a Shopping Cart**

**Scenario:**
You are tasked with building an e-commerce application that includes a shopping cart. Users can add items to their cart, remove items, and they also want an undo feature to reverse their last action. Your goal is to implement the shopping cart functionality with the ability to undo the last action, whether it was adding or removing an item.

## **Requirements:**

1. The shopping cart should hold a list of items.
2. Users should be able to add and remove items from the cart.
3. Users should be able to undo the last action (adding or removing an item).
4. Each state of the cart (list of items) should be saved and restored using the Memento pattern.

## **Steps:**

- **Originator**: This will be the ShoppingCart, which holds a list of items and can save and restore its state.
- **Memento**: The Memento will hold a snapshot of the cart’s state (the list of items).
- **Caretaker**: The Caretaker will manage the history of the cart’s states and allow users to undo the last action.

## **Deliverables:**

1. Create the ShoppingCart, Memento, and Caretaker classes.
2. Implement the functionality to add, remove, and undo actions in the cart.
3. Write a Main class to test your solution by adding and removing items, and then undoing actions.