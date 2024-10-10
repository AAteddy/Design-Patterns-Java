package behavioral.state_pattern.problem2;

public class OutOfServiceState implements ATMState {
    @Override
    public void insertCard(ATM atm) {
        System.out.println("ATM is out of service. No transactions allowed.");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("ATM is out of service.");
    }

    @Override
    public void enterPin(ATM atm, int pin) {
        System.out.println("ATM is out of service.");
    }

    @Override
    public void withdrawCash(ATM atm, float amount) {
        System.out.println("ATM is out of service. No cash available.");
    }
}
