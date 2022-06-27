/* 
Manager inherit everything (except private instance variables) from Employee
Manager is different from Employee in a way that they also get bonus.
*/
public class Manager extends Employee {
  
    // manager gets bonus that regular employees don't get
    private int bonus;
    
    public Manager(String name, int salary, int bonus) {
        // we need to construct instance variables from superclass first
        // Calling this.method before super() is wrong
        super(name, salary); // super() method retrives instance variables from Employee superclass
        this.bonus = bonus;
    }
    
    public void setBonus(int newBonus) {
        bonus = newBonus;    
    }
    
    // Override .getCompensation() method to also include bonus
    // basically compensation = salary + bonus
    public int getCompensation() {
        //return salary + bonus; // wrong 'salary' is private instance variable
        // we want to call getCompensation() that is called from superclass (Employee.java)
        return super.getCompensation() + bonus;
    }
   
  }