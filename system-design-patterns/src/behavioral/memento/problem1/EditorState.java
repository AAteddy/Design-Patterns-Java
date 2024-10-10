package behavioral.memento.problem1;

/**
 * EditorState - is responsible for storing current TextEditor's object state
 */

public class EditorState {
    private final String state;

    public EditorState(String text) {
        this.state = text;
    }

    public String getState() {
        return state;
    }
}
