package behavioral.memento.problem3;

import java.util.Objects;

public class Item {
    private String name;

    public Item(String name) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name); // Compare by name
    }

    // Override hashCode() to match the equals() contract
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
