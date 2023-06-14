package emp_practice;

public class SalarayCalculator {
    int salaryPerDay;
    int workHoursPerDay;
    int daySalary;

    public SalarayCalculator(int salary, int workHoursPerDay){
        this.salaryPerDay = salary;
        this.workHoursPerDay = workHoursPerDay;
//        this.daySalary = daySalary;
    }

    public SalarayCalculator() {

    }

//    Write a program by creating an 'Employee' class having the following methods and printthe final salary.
//    1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
//    2   - 'AddSal()'   which   adds   $10   to   salary   of   the   employee   if   it   is   less   than   $500.
//    3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work perday is more than 6 hours.

    public void getinfo( int salaryPerDay, int workHoursPerDay){
        daySalary = salaryPerDay * workHoursPerDay;

        System.out.println("per day salary : "+ daySalary);
    }
    public  void addSal(){
        if(daySalary < 500){
            int newSalary = daySalary+10;
            System.out.println("New Salary after adding 5$ : "+ newSalary);
        }
    }
    public void addWork(int workHoursPerDay){

        if(workHoursPerDay < 6){
            int newSalary = daySalary+5;
            System.out.println("New Salary after adding 10$ : "+newSalary);
        }

    }



}
