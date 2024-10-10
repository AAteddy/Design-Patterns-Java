package behavioral.state_pattern.problem1;

public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        // Try to select a product before inserting money
        vendingMachine.selectProduct();

        // Insert money and select a product
        vendingMachine.insertMoney();
        vendingMachine.selectProduct();
        vendingMachine.dispenseProduct();

        // Insert money and select another product
        vendingMachine.insertMoney();
        vendingMachine.selectProduct();
        vendingMachine.dispenseProduct();

        // Try to insert money after the machine is out of stock
        vendingMachine.insertMoney();
        vendingMachine.selectProduct();
        vendingMachine.dispenseProduct();
    }
}
