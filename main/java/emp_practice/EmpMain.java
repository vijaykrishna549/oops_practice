package emp_practice;

import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary per Hour");
        int salary = sc.nextInt();
        System.out.println("Enter Work Hours Per Day ");
        int workHoursperDay = sc.nextInt();
//        System.out.println("Enter day Salary");
//        int daySalary = null;
        SalarayCalculator scl = new SalarayCalculator(salary,workHoursperDay);
        scl.getinfo(salary,workHoursperDay);
        scl.addSal();
        scl.addWork(workHoursperDay);
    }
}
