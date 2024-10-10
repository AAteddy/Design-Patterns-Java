package behavioral.memento.problem2;

public class CanvasDemo {

    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        Caretaker caretaker = new Caretaker();

        // Add shapes to canvas
        canvas.addShape(new Shape("Square"));
        canvas.addShape(new Shape("Triangle"));
        canvas.showCanvas();

        // Save the state after adding shapes
        caretaker.saveState(canvas);

        // Add shapes to canvas
        canvas.addShape(new Shape("Circle"));
        canvas.showCanvas();

        // Save the state after adding shapes
        caretaker.saveState(canvas);

        // Remove shape from canvas
        canvas.removeShape(new Shape("Triangle"));
        canvas.showCanvas();

        // Save the state after adding shapes
        caretaker.saveState(canvas);

        //Add shapes to canvas
        canvas.addShape(new Shape("Rectangle"));
        canvas.showCanvas();

        //undo the last action (removal of Rectangle)
        caretaker.undo(canvas);
        canvas.showCanvas();

        //undo again (removal of Triangle)
        caretaker.undo(canvas);
        canvas.showCanvas();

        //undo again (removal of circle)
        caretaker.undo(canvas);
        canvas.showCanvas();

    }
}
