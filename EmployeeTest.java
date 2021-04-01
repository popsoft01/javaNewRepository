
public class EmployeeTest {
        public static void main(String... args){

            Employee newEmployee = new Employee("micheal", "Ade", 10000);
            Employee newEmployee1 = new Employee("Olu","sade", 20000);

            System.out.println("The employee details is: " + newEmployee.getFirstName() +" " + newEmployee.getLastName() + " and salary per annual is" +" "+newEmployee.getSalary());
            System.out.println("The employee details is: " + newEmployee1.getFirstName() +" "+ newEmployee1.getLastName() + " and salary per annual is" +" "+ newEmployee1.getSalary());

            System.out.println("The employee details is: " + newEmployee.getFirstName() +" "+ newEmployee.getLastName() + " and 10% of salary is" +" "+ newEmployee.newSalary());
            System.out.println("The employee details is: " + newEmployee1.getFirstName() +" "+ newEmployee1.getLastName() + " and 10% of salary is" +" "+ newEmployee1.newSalary());

            System.out.println("The employee details is: " +" "+  newEmployee.getFirstName()+" "+ newEmployee.getLastName()+" "+ " and salary "+" "+ newEmployee.raisePerAnnual());
            System.out.println("The employee details is: " + newEmployee1.getFirstName() +" "+ newEmployee1.getLastName() + " and salary" +" "+ newEmployee1.raisePerAnnual());

        }
}
