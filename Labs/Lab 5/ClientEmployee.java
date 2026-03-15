import java.util.Scanner;

public class ClientEmployee {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Employee prof = new Employee("John", "Doe", 25.50, 50, "COSC");

        System.out.print("Enter employee last name: ");
        String last = input.nextLine();
        System.out.print("Enter employee first name: ");
        String first = input.nextLine();
        System.out.print("Enter department: ");
        String dept = input.nextLine();
        System.out.print("Enter employee pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter employee hours worked: ");
        double hrsWorked = input.nextDouble();

        Employee emp = new Employee();
        emp.setAll(first, last, payRate, hrsWorked, dept);

        System.out.println("\nRecord for both employees with overridden .toString from subclass");
        System.out.println(prof);
        System.out.println(emp);

        System.out.println("\nOutput with calls to overridden method print from subclass");
        prof.print();
        emp.print();

        System.out.println("\nOutput with calls to getters from the superclass");
        System.out.println("The wages for " + emp.getFirstName() + " " + emp.getLastName() + " from the " + emp.getDepartment() +" department are $" + String.format("%.2f", emp.calculatePay()));

        System.out.println("\nCall to overridden equals/subclass for 2 Employee objects");
        if (prof.equals(emp)) {
            System.out.println("Found an employee with same record.");
        } else {
            System.out.println("Couldn't find an employee with same record.");
        }

        input.close();
    }
}
