public class Employee extends Person {
   
    private double payRate;
    private double hoursWorked;
    private String department;

    public final int HOURS = 40;
    public final double OVERTIME = 1.5;

    public Employee() {
        super();
        payRate = 0.0;
        hoursWorked = 0.0;
        department = "";
    }

    public Employee(String iFirst, String iLast, double rate, double hours, String dep) {
        super(iFirst, iLast);
        payRate = rate;
        hoursWorked = hours;
        department = dep;
    }

    public double calculatePay() {
        if (hoursWorked <= HOURS)
            return hoursWorked * payRate;
        else {
            double overtimeHours = hoursWorked - HOURS;
            return (HOURS * payRate) + (overtimeHours * payRate * OVERTIME);
        }
    }

    // Override toString
    public String toString() {
        return "The wages for " + super.toString() + " from the " + department + " department are: $" + String.format("%.2f", calculatePay());
    }

    public void print() {
        System.out.println("The employee " + getFirstName() + " " + getLastName() +
                " from the " + department + " department worked " + hoursWorked +" hours with a pay rate of $" + String.format("%.2f", payRate) + ". The wages for " + getFirstName() + " " + getLastName() +
                " are $" + String.format("%.2f", calculatePay()));
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void set(String first, String last, double rate, double hours, String dep) {
        setName(first, last);
        payRate = rate;
        hoursWorked = hours;
        department = dep;
    }


    
    public void setName(String name) {
        String[] parts = name.split(" ");
        if (parts.length == 2) {
            firstName = parts[0];
            lastName = parts[1];
        } else {
            throw new IllegalArgumentException("Name must contain first and last name.");
        }
    }

    public void setName(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }
    public void setAll(String firstName, String lastName, double payRate, double hoursWorked, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public String getDepartment() {
        return department;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Employee)) return false; 
            Employee e = (Employee) obj;
            return super.equals(e) &&
            payRate == e.payRate &&
            hoursWorked == e.hoursWorked &&
            department.equals(e.department);
        
    }

    public Employee getCopy() {
        return new Employee(getFirstName(), getLastName(), payRate, hoursWorked, department);
    }


    public void copy(Employee e) {
        set(e.getFirstName(), e.getLastName(), e.payRate, e.hoursWorked, e.department);
    }
}
