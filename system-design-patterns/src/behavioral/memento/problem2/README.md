# **Real-World Problem Example with Solution**

## **Problem: Undo Functionality for a Drawing Application**

Imagine you are building a simple drawing application where users can draw shapes on a canvas. Users want the ability to undo their last action — whether that’s adding a shape, moving a shape, or deleting one.

## Problem Breakdown:
1. Users perform multiple operations on the canvas (adding, moving, or removing shapes).
2. The application should support an undo feature to revert the canvas to its previous state after each operation.

## Solution Using the Memento Pattern:

In this case:

- The Originator will be the canvas, which stores a list of shapes.
- The Memento will store a snapshot of the canvas (the state of the list of shapes).
- The Caretaker will manage the history of canvas states, allowing the user to undo actions by restoring a previous state.
