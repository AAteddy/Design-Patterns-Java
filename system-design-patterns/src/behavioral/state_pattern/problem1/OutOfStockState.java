package behavioral.state_pattern.problem1;

public class OutOfStockState implements VendingMachineState{

    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Sorry the machine is out of stock. No more products available.");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Sorry no products available.");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Sorry no products available to dispense.");
    }
}
