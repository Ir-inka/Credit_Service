public class CreditService {
    // amountOfCredit - сумма кредита, persent - процент (годовой),
    // period - срок кредита (в месяцах), percentagePerMonth - процент (ежемесячный)
    // degree - возведение в степень для расчета по формуле (1 + percentagePerMonth)^period
    public int calculate(int amountOfCredit, double persent, int period) {
        double percentagePerMonth = persent / (12 * 100);
        double degree = Math.pow(1 + percentagePerMonth, period);
        double payment = amountOfCredit * (percentagePerMonth * degree) / (degree - 1);
        return (int) payment;


    }
}
