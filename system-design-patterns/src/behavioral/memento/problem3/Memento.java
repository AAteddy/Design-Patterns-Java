package behavioral.memento.problem3;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private List<Item> itemState;

    public Memento(List<Item> items) {
        this.itemState = new ArrayList<>(items);
    }

    public List<Item> getItemState() {
        return itemState;
    }

}
