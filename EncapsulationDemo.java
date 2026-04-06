/* 
 * QUESTION: 
 * Create a class 'Employee' that demonstrates Encapsulation. 
 * Ensure the salary cannot be accessed directly but can be updated 
 * only if the new value is positive.
 */

class Employee {
    private String name;
    private double salary; // Private data

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter
    public double getSalary() {
        return salary;
    }

    // Setter with validation logic
    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        } else {
            System.out.println("Error: Salary must be positive!");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 50000);
        emp.setSalary(-1000); // Validation check
        System.out.println("Current Salary: " + emp.getSalary());
    }
}
