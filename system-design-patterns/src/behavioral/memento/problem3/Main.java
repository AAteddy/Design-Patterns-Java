package behavioral.memento.problem3;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Caretaker caretaker = new Caretaker();

        // Add items to the shopping cart
        cart.addItem(new Item("Item A"));
        cart.showShoppingCart();
        caretaker.save(cart);

        // Add items to the shopping cart
        cart.addItem(new Item("Item B"));
        cart.showShoppingCart();
        caretaker.save(cart);

        // Remove item from the shopping cart (Item A)
        cart.removeItem(new Item("Item A"));
        cart.showShoppingCart();

        // Undo
        caretaker.undo(cart);
        cart.showShoppingCart();

        // Undo again
        caretaker.undo(cart);
        cart.showShoppingCart();
    }
}
