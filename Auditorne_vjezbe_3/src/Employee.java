public class Employee {
    private String name;
    private double salary;
    private int id;
    public Employee(String name, int id,double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
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
    public String getDetails(){
        return "ID:"+ id + ",Name"+ name + ",Salary:$" + salary;
    }
}
