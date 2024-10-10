package behavioral.memento.problem2;

import java.util.ArrayList;
import java.util.List;

/**
 * CanvasState class acts like The Memento, it will store a snapshot of the list of shapes.
 */
public class CanvasState {
    private final List<Shape> shapesState;

    public CanvasState(List<Shape> stateShapes) {
        this.shapesState = new ArrayList<>(stateShapes);
    }

    public List<Shape> getShapesState() {
        return shapesState;
    }
}
