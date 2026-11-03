import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101, 50000);
        Manager mgr1 = new Manager("Bob", 102, 80000, 15000);
        Employee emp2 = new Employee("Charlie", 103, 90000);

        System.out.println(emp1.getDetails());
        emp1.work();

        System.out.println(mgr1.getDetails());
        mgr1.work();

        System.out.println(emp2.getDetails());
        emp2.work();

        ArrayList<Employee> employees = new ArrayList<>();

        Path dataFile = Paths.get("EmployeeData.txt");
        if (!Files.exists(dataFile)) {
            dataFile = Paths.get("Auditorne_vjezbe_3", "EmployeeData.txt");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(dataFile.toFile()))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String type = parts[0];
                String name = parts[1];
                int id = Integer.parseInt(parts[2]);
                double salary = Double.parseDouble(parts[3]);

                if (type.equals("EMPLOYEE")) {
                    employees.add(new Employee(name, id, salary));
                } else if (type.equals("MANAGER")) {
                    double bonus = Double.parseDouble(parts[4]);
                    employees.add(new Manager(name, id, salary, bonus));
                } else if (type.equals("INTERN")) {
                    String school = parts[4];
                    employees.add(new Intern(name, id, salary, school));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        for (Employee employee : employees) {
            System.out.println(employee.getDetails());
            employee.work();
        }

        Intern intern1 = new Intern("Amer", 104, 30000, "IPI Akademija");
        System.out.println(intern1.getDetails());
        intern1.work();

        double totalCosts = calculateTotalCosts(employees);
        System.out.println("Ukupni troškovi plata: $" + totalCosts);
    }

    public static double calculateTotalCosts(ArrayList<Employee> employees) {
        double totalCosts = 0;

        for (Employee employee : employees) {
            totalCosts += employee.getSalary();

            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                totalCosts += manager.getTotalSalary() - manager.getSalary();
            }
        }

        return totalCosts;
    }
}
