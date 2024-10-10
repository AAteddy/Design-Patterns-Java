package behavioral.state_pattern.problem2;

public interface ATMState {

    void insertCard(ATM atm);
    void ejectCard(ATM atm);
    void enterPin(ATM atm, int pin);
    void withdrawCash(ATM atm, float amount);
}
