public class Employee { // Employee extends Object
                        // one of the method of Object is toString()
  
    // two private instance variables 
    private String name; // immutable
    private int salary; // mutable
  
    public Employee(String n, int s) {
        name = n;
        salary = s;
    }

    // Accessor method returning name
    public String getName() { 
        return name;
    }

    // Accessor method returning salary
    public int getCompensation() {
        return salary;
    }

    // Mutator method that changes the salary
    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    // Overriding toString() method
    public String toString() {
        return getName() + " - $" + getCompensation();
    }
  
}