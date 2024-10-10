package behavioral.memento.problem2;


import java.util.Stack;

/**
 * Caretaker class stores the history of canvas states and allows undoing
 */
public class Caretaker {
    private Stack<CanvasState> history = new Stack<>();

    public void saveState(Canvas canvas) {
        history.push(canvas.save());
    }

    public void undo(Canvas canvas) {
        if(!history.isEmpty()) {
           CanvasState state = history.pop();
           canvas.restore(state);
        } else
            System.out.println("No states to undo");
    }
}
