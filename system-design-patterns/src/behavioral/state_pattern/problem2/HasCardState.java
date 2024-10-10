package behavioral.state_pattern.problem2;

public class HasCardState implements ATMState {
    @Override
    public void insertCard(ATM atm) {
        System.out.println("A Card is already inserted.");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Card is ejected.");
        atm.setCurrentState(new IdleState());
    }

    @Override
    public void enterPin(ATM atm, int pin) {
        if (pin == 1234) {
            System.out.println("Correct Pin. You can now withdraw a cash");
            atm.setCurrentState(new AuthorizedState());
        } else {
            System.out.println("Incorrect Pin. Try again.");
        }
    }

    @Override
    public void withdrawCash(ATM atm, float amount) {
        System.out.println("Enter a Pin first before withdrawing a cash.");
    }
}
