package behavioral.memento.problem1;

/**
 * TextEditor - is the object we want to save its state.
 *
 *
 */
public class TextEditor {
    private String text;

    public EditorState save() {
        return new EditorState(text);
    }

    public void restore(EditorState state) {
        text = state.getState();
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
