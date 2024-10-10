package behavioral.state_pattern.problem2;

public class AuthorizedState implements ATMState {

    @Override
    public void insertCard(ATM atm) {
        System.out.println("A Card is already inserted");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Card ejected");
        atm.setCurrentState(new IdleState());
    }

    @Override
    public void enterPin(ATM atm, int pin) {
        System.out.println("PIN already provided");
    }

    @Override
    public void withdrawCash(ATM atm, float amount) {
        if (amount <= atm.getBalance()) {
            System.out.println("Withdrawing $ " + amount);
            atm.setBalance(atm.getBalance() - amount);

            if (atm.getBalance() > 0) {
                atm.setCurrentState(new IdleState());
            } else {
                System.out.println("ATM is now out of service");
                atm.setCurrentState(new OutOfServiceState());
            }
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
