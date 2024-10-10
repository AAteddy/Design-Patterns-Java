package behavioral.memento.problem2;

import java.util.ArrayList;
import java.util.List;

/**
 * Canvas class represents the drawing area where shapes are stored.
 * It will allow adding, removing, and saving/restoring states.
 */
public class Canvas {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    // Save the current state of the canvas
    public CanvasState save() {
        return new CanvasState(shapes);
    }

    // Restores the canvas state from the Memento
    public void restore(CanvasState shapesState) {
        this.shapes = shapesState.getShapesState();
    }


    public void showCanvas() {
        System.out.println("Current Shapes: " + shapes);
    }
}
