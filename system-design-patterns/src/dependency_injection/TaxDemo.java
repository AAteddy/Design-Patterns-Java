package dependency_injection;

public class TaxDemo {

    public static void main(String[] args) {
        TaxCalculator2022 calculator = new TaxCalculator2022(10_000);

        //constructor dependency injection
//        TaxReport report = new TaxReport(calculator);
//        var tax = report.show();
//        System.out.println(tax);

        //Setter dependency injection
//        report.setCalculator(new TaxCalculator2023(10_000));
//        var tax2 = report.show();
//        System.out.println(tax2);

        //method dependency injection
        TaxCalculator2024 calculator3 = new TaxCalculator2024(10_000);
        TaxReport report = new TaxReport();
        var tax = report.show(calculator3);
        System.out.println(tax);
        var tax2 = report.show(new TaxCalculator2023(10_000));
        System.out.println(tax2);
    }
}
