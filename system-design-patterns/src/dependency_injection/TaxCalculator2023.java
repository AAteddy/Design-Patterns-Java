package dependency_injection;

public class TaxCalculator2023 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2023(double income) {
        this.taxableIncome = income;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.1;
    }
}
