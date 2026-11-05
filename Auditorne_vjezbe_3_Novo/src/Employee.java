import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Employee implements Comparable<Employee>,Cloneable{

    private String name;
    private double salary;
    private int id;
    private LocalDate hireDate;

    public Employee(String name, double salary, int id) {
        this(name, id, salary, LocalDate.now());
    }

    public Employee(String name, int id, double salary) {
        this(name, id, salary, LocalDate.now());
    }

    public Employee(String name, int id, double salary, LocalDate hireDate) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.hireDate = hireDate;

    }
    public double getSalary() {
        return salary;

    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void work(){
        System.out.println(name + "is working");

    }
    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(this.id, employee.id);
    }

@Override
public Employee clone() {
        try{
            Employee kopija = (Employee) super.clone();
            return kopija;
        }catch (CloneNotSupportedException e){
            throw new AssertionError(e);
        }
}
    public String getWorkDuration() {
        Period period = Period.between(hireDate, LocalDate.now());

        return period.getYears() + " godina, "
                + period.getMonths() + " mjeseci i "
                + period.getDays() + " dana";
    }

    public String getDetails(){
        return "ID:"+ id + ",Name"+ name + ",Salary:$" + salary;
    }
}
