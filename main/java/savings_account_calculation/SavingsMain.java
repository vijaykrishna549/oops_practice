package savings_account_calculation;

public class SavingsMain {
    public static void main(String[] args) {
        SavingsCalculator saver1 = new SavingsCalculator(12, 2000);
        SavingsCalculator saver2 = new SavingsCalculator(12, 3000);
        saver1.calculateMonthlyInterest();
        System.out.println(   saver1.calculateMonthlyInterest());
        System.out.println(saver2.calculateMonthlyInterest());
    }
}
