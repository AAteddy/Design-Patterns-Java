package dependency_injection;

public class TaxCalculator2024 implements TaxCalculator {
    private  double taxableIncome;

    public TaxCalculator2024(double income) {
        this.taxableIncome = income;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.5;
    }
}
