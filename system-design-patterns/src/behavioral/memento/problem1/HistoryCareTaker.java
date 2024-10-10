package behavioral.memento.problem1;

import java.util.Stack;

/**
 * HistoryCareTaker - is responsible for storing TextEditor state via EditorState in a list
 * and restoring the states.
 */

public class HistoryCareTaker {
    private Stack<EditorState> history = new Stack<>();

    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if(!history.isEmpty()) {
            EditorState state = history.pop();
            editor.restore(state);
        } else
            System.out.println("No states to undo");
    }
}
