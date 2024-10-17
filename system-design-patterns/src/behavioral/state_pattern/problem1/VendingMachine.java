package behavioral.state_pattern.problem1;

/**
 * This class (Context class) maintains a reference to the current state
 * and delegates behavior to the state
 */
public class VendingMachine {
    private VendingMachineState currentState;
    private int productCount = 2; // let's we have 2 products initially

    public VendingMachine() {
        this.currentState = new IdleState(); // initial state
    }

    public void insertMoney() {
        currentState.insertMoney(this);
    }

    public void selectProduct() {
        currentState.selectProduct(this);
    }

    public void dispenseProduct() {
        currentState.dispenseProduct(this);
    }

    public void setCurrentState(VendingMachineState state) {
        this.currentState = state;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
}

