package behavioral.memento.problem2;

/**
 * Shape class represents the objects we will draw on the canvas.
 */

public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
