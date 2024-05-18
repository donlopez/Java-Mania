public class SalesIncomeCalculator {

    public static void main(String[] args) {
        System.out.println("Sales Amount | Total Income");
        System.out.println("--------------------------");
        for (int sales = 1000; sales <= 20000; sales += 1000) {
            double income = computeIncome(sales);
            System.out.printf("$%,10d | $%,10.2f\n", sales, income);
        }
    }

    public static double computeIncome(double salesAmount) {
        double baseSalary = 5000;
        double commission = 0;

        if (salesAmount > 10000) {
            // Commission for the amount above $10,000 at 12%
            commission += (salesAmount - 10000) * 0.12;
            salesAmount = 10000;
        }
        if (salesAmount > 5000) {
            // Commission for the amount between $5,000.01 and $10,000 at 10%
            commission += (salesAmount - 5000) * 0.10;
            salesAmount = 5000;
        }
        // Commission for the first $5,000 at 8%
        commission += salesAmount * 0.08;

        return baseSalary + commission;
    }
}
