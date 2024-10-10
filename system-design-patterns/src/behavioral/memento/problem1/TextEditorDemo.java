package behavioral.memento.problem1;

public class TextEditorDemo {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        HistoryCareTaker careTaker = new HistoryCareTaker();

        editor.setText("My first text");
        System.out.println("Current Text: " + editor.getText());
        careTaker.saveState(editor);

        editor.setText("My second text");
        System.out.println("Current Text: " + editor.getText());
        careTaker.saveState(editor);

        editor.setText("My last text");
        System.out.println("Current Text: " + editor.getText());
//        careTaker.saveState(editor);

        careTaker.undo(editor);
        System.out.println("After Undo: " + editor.getText());

        careTaker.undo(editor);
        System.out.println("After second undo: " + editor.getText());
    }

}
