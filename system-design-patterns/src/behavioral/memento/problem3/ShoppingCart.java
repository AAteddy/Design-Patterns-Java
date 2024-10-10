package behavioral.memento.problem3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    // Save the current state of the Shopping cart
    public Memento saveState() {
        // ensure that the Memento stores a deep copy of the cart’s items,
        // preventing unintended changes (shallow copy issues)
        List<Item> itemsCopy = new ArrayList<>(items);
        return new Memento(itemsCopy);
    }

    //restore the shopping cart state from the memento
    public void restore(Memento stateItem) {
        this.items = new ArrayList<>(stateItem.getItemState());
    }

    public void showShoppingCart() {
        System.out.println("Current Shopping cart: " + items);
    }
}
