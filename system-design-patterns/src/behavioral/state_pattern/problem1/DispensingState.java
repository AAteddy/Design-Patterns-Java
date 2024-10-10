package behavioral.state_pattern.problem1;

public class DispensingState implements VendingMachineState{

    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Please wait. We are already dispensing your product");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Please wait. We are already dispensing your product");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        if (vendingMachine.getProductCount() > 0) {
            System.out.println("Dispensing product. Thank you.");
            vendingMachine.setProductCount(vendingMachine.getProductCount() - 1);

            // Check if we have more products or go to Out of Stock
            if (vendingMachine.getProductCount() > 0)
                vendingMachine.setCurrentState(new IdleState());
            else {
                System.out.println("Out of Stock. No more products available");
                vendingMachine.setCurrentState(new OutOfStockState());
            }
        } else {
            System.out.println("No products available");
            vendingMachine.setCurrentState(new OutOfStockState());
        }
    }
}
