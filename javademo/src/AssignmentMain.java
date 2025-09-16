import com.tnsif.assignment.employees.*;
import com.tnsif.assignment.utilities.EmployeeUtilities;


public class AssignmentMain {
    public static void main(String[] args) {
        
        Manager m1 = new Manager("Alice", 101, 80000, "HR");
        Developer d1 = new Developer("Bob", 102, 60000, "Java");

        
        System.out.println("=== Employee Details ===");
        m1.displayInfo();
        d1.displayInfo();

        
        EmployeeUtilities util = new EmployeeUtilities();
        System.out.println("\n=== Salary Update ===");
        util.increaseSalary(m1, 10);
        util.increaseSalary(d1, 15);

        System.out.println("\n=== Salary Comparison ===");
        util.compareSalary(m1, d1);
    }
}
