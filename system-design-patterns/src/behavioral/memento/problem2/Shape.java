package behavioral.memento.problem2;

import behavioral.memento.problem3.Item;

import java.util.Objects;

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


    // Override equals() to compare items by name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Shape shape)) return false;
        return Objects.equals(name, shape.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    //intellij generated equals & hasCode methods
    // Override equals() to compare items by name
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Shape shape = (Shape) o;
//        return Objects.equals(name, shape.name); // Compare by name
//    }

    // Override hashCode() to match the equals() contract
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }

}
