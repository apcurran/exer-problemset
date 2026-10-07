public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        int currentMultiplier = bonusMultiplier(productsSold);

        return productsSold * currentMultiplier;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double value = 1_000.00 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);

        return Math.min(value, 2_000.00);
    }
}
