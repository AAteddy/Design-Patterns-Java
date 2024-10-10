package behavioral.state_pattern.problem2;

public class ATM {
    private ATMState currentState;
    private float  balance = 1000.0F; // ATM starts with $1000

    public ATM() {
        this.currentState = new IdleState();
    }

    public void setCurrentState(ATMState state) {
        this.currentState = state;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void insertCard() {
        currentState.insertCard(this);
    }

    public void ejectCard() {
        currentState.ejectCard(this);
    }

    public void enterPin(int pin) {
        currentState.enterPin(this, pin);
    }

    public void withdrawCash(float amount) {
        currentState.withdrawCash(this, amount);
    }
}
