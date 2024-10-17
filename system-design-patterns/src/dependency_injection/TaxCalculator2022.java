package dependency_injection;

public class TaxCalculator2022 implements TaxCalculator {
    private double income;

    public TaxCalculator2022(double income) {
        this.income = income;
    }

    @Override
    public double calculateTax() {
        return this.income * 0.2;
    }
}
