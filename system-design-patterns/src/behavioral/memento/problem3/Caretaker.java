package behavioral.memento.problem3;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> history = new Stack<>();

    public void save(ShoppingCart cart) {
        history.push(cart.saveState());
    }

    public void undo(ShoppingCart cart) {
        if(!history.isEmpty()) {
            Memento item = history.pop();
            cart.restore(item);
        } else {
            System.out.println("No states to undo");
        }
    }
}
