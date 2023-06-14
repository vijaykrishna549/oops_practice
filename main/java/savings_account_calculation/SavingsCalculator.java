package savings_account_calculation;

public class SavingsCalculator {
//    Create   a  SavingsAccount   class.  Use   a   static   data  member  annualInterestRate to store
//    the annual interest rate for each of the savers. Each member of the class contains private data member
//    savings Balance indicating the amount the saver currently has ond deposit. Provide member function
//    calculateMonthlyInterest that calculates the monthly interest by multiplying the  balance  by
//    annual InterestRate  divided  by  12;  this  interest should     be     added     to   savingsBalance.

//    Provide   a   static   member   function modifyInterestRate that sets the static annual InterestRate to a new value.
//    Write a driver program   to   test   class   SavingsAccount.
//    Instantiate   two   different   objects   of   classSavingsAccount,   saver1   and   saver2,   with   balances
//    of   $2000.00   and   $3000.00,respectively.   Set   the   annualInterestRate   to   3   percent.
//    Then   calculate   the   monthly interest   and   print   the   new   balances   for   each   of   the   savers.
//    Then   set   the annual InterestRate to 4 percent, calculate the next month's interest and print the new balances
//    for each of the savers

    int annualInterestRate;  // to store annual interest rate
    int savingsBalance; // to know thw savings deposit
    int monthlyInterest;

    public SavingsCalculator(int annualInterestRate, int savingsBalance) {
        this.savingsBalance = savingsBalance;
        this.annualInterestRate = annualInterestRate;
    }

    public double calculateMonthlyInterest() {
        monthlyInterest = (annualInterestRate * savingsBalance) / 12;
//        System.out.println(monthlyInterest+"m1");
        savingsBalance = monthlyInterest +savingsBalance;
//        System.out.println("sa1"+savingsBalance);
        return monthlyInterest;
    }

    public double modifyInterestRate(){

        return 0;
    }
}
