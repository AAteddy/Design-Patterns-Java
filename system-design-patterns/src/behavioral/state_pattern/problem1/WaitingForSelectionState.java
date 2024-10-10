package behavioral.state_pattern.problem1;

public class WaitingForSelectionState implements VendingMachineState{

    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Money already inserted. Please select a product.");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Product selected. Dispensing a product...");
        vendingMachine.setCurrentState(new DispensingState());
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Please select a product first.");
    }
}
