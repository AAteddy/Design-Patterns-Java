package dependency_injection;

public class TaxReport {

    private TaxCalculator calculator;

    //constructor dependency injection
//    public TaxReport( TaxCalculator calculator) {
//        this.calculator = calculator;
//    }

    //method dependency injection
    public double show(TaxCalculator calculator) {
        return calculator.calculateTax();
    }

    //setter dependency injection
//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }
}
