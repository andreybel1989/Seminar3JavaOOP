import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        // String s = "Hello";
        // System.out.println(s);
        // Worker worker1 = EmployeeFabric.generateWorker();
        // System.out.println(worker1);

        Employee[] employees = EmployeeFabric.generateEmployees(15);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();
        System.out.println("***");
        System.out.println();
        Arrays.sort(employees, new AgeComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        
    }
}
