
public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String firstName) {
        this.firstName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(double salary) {
        if (salary < 0)
            this.salary = salary;
    }
	public double getSalary() {
        return (salary *= 12);
    }
    public double newSalary(){
        return(salary * 0.1);}

    public double raisePerAnnual(){
        return getSalary() * newSalary();
    }

}
