/*
 * Modify your runner so that it has a variable of the type you defined in your parent class and instantiate it as an instance of one of your child classes. 
 * Then print out the runtime type of your class to see for yourself that it will be the type of your child class.
 */
import java.util.ArrayList;

public class ModifiedEmployeeRunner {
  
    public static void main(String[] args) {
    
        // Create an ArrayList of Employee named a
        ArrayList<Employee> a = new ArrayList<>();

        // a.add(new Employee("Doug", 56000));
        Employee EmployeeDoug = new Employee("Doug", 56000);

        // a.add(new Employee("Jim", 120000));
        Employee EmployeeJim = new Employee("Jim", 120000);

        // a.add(new Manager("Bob", 180000, 25000));
        Employee EmployeeBob = new Manager("Bob", 180000, 25000);
        Manager ManagerBob = (Manager)EmployeeBob;

        // a.add(new Manager("Shirly", 220000, 40000));
        Employee EmployeeShirly = new Manager("Shirly", 220000, 40000);
        Manager ManagerShirly = (Manager)EmployeeShirly;

        // a.add(new Executive("Elon", 1500000, 0, 500000000));
        Employee EmployeeElon = new Executive("Elon", 1500000, 0, 500000000);
        Executive ExecutiveElon = (Executive)EmployeeElon;

        // a.add(new Executive("Richard", 40000000, 0, 25000000));
        Employee EmployeeRichard = new Executive("Richard", 40000000, 0, 25000000);
        Executive ExecutiveRichard = (Executive)EmployeeRichard;

        // add the employees into an ArrayList
        a.add(EmployeeDoug);
        a.add(EmployeeJim);
        a.add(ManagerBob);
        a.add(ManagerShirly);
        a.add(ExecutiveElon);
        a.add(ExecutiveRichard);
    
        // iterate its class type
        System.out.println("Class Type: ");  
        for (Employee e: a) {
            System.out.println(e.getClass().toString());  
        }  

  }

}