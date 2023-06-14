package calculator;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int a : ");
        int a = sc.nextInt();
        System.out.println("Enter int b : ");
        int b = sc.nextInt();
        AdvCalculator calculator = new AdvCalculator();
        System.out.println("Sum is : "+  calculator.sum(a,b) );

        System.out.println("Subtraction is : "+   calculator.sub(a,b));
        System.out.println("Multiplication is : "+   calculator.mult(a,b));
        System.out.println("Division is : "+  calculator.div(a,b));
    }


}
