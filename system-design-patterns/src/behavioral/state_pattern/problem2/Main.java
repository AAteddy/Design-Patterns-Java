package behavioral.state_pattern.problem2;

public class Main {

    public static void main(String[] args) {
        ATM atm = new ATM();

        // Insert card, enter PIN, and withdraw cash
        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawCash(500);

        // Try another withdrawal
        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawCash(500);

        // Try when out of service
        atm.insertCard();

    }
}
