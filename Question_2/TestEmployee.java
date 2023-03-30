package Question_2;

public class TestEmployee {
    static void printPay(Employee emp) {
        System.out.println("Employee name: " + emp.getName() + "\nSalary: " + emp.getSalary());
    }

    public static void main(String[] args) {
        MonthlyEmployee monEmp = new MonthlyEmployee("Ernest", 50000);
        HourlyEmployee hourEmp = new HourlyEmployee("Haruna", 50, 9);
        printPay(monEmp);
        printPay(hourEmp);
    }
}

/*
 * Write a class, TestEmpolyee, that has the following methods:
 * printPay(Employee emp) : that prints the name and salary of emp.
 * 
 * a main method that creates an instance of MonthlyEmployee and
 * that of HourlyEmployee, and prints them using printPay method
 */