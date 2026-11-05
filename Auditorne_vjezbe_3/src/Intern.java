public class Intern extends Employee {
    private String school;

    public Intern(String name, int id, double salary, String school) {
        super(name, id, salary);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working as an intern");
    }
@Override
    public String getDetails(){
        return super.getDetails() + ",School:"+ school;
}
}
