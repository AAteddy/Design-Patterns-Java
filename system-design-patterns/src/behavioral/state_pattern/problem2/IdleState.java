package behavioral.state_pattern.problem2;

public class IdleState implements ATMState {

    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card inserted. Please enter your pin.");
        atm.setCurrentState(new HasCardState());
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("No card to eject.");
    }

    @Override
    public void enterPin(ATM atm, int pin) {
        System.out.println("Please insert a card first.");
    }

    @Override
    public void withdrawCash(ATM atm, float amount) {
        System.out.println("Please insert a card first.");
    }
}
