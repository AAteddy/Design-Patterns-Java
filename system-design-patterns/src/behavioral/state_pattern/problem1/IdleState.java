package behavioral.state_pattern.problem1;

public class IdleState implements VendingMachineState{

    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Money inserted. You can now select a product");
        vendingMachine.setCurrentState(new WaitingForSelectionState());
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Please insert money first.");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Please insert money and select a product.");
    }
}
