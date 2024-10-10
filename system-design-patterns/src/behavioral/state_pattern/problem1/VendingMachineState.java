package behavioral.state_pattern.problem1;

/**
 * This interface defines the common behavior for all states
 */

public interface VendingMachineState {

    void insertMoney(VendingMachine vendingMachine);
    void selectProduct(VendingMachine vendingMachine);
    void dispenseProduct(VendingMachine vendingMachine);
}
