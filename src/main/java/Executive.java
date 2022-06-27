public class Executive extends Employee  {
 
    // Executives get stock compensation that managers don't get
    private int bonus;
    private int stockCompensation;
    
    public Executive(String name, int salary, int bonus, int stockCompensation) {
        // we need to construct instance variables from superclass first
        // Calling this.method before super() is wrong
        super(name, salary); // super() method retrives instance variables from Employee superclass
        this.bonus = bonus;
        this.stockCompensation = stockCompensation;
    }
    
    public void setBonus(int newBonus) {
        bonus = newBonus;    
    }

    public void setStockCompensation(int newStockCompensation) {
        stockCompensation = newStockCompensation;    
    }
    
    // Override .getCompensation() method to also include bonus
    // basically compensation = salary + bonus
    public int getCompensation() {
        //return salary + bonus; // wrong 'salary' is private instance variable
        // we want to call getCompensation() that is called from superclass (Employee.java)
        return super.getCompensation() + bonus + stockCompensation;
    }

}
