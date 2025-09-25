package Employee_Management_System;

public class FullTimeEmployee extends Employee {

    private double bonus;

    public double getBonus()
    {  
         return bonus; 
    }
    public void setBonus(double bonus)
    {   
        this.bonus = bonus ; 
    }
    
    public FullTimeEmployee(int id, String name, double salary,double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
       
    }

    @Override
    public void displayDetails() {
        System.out.println("Full-Time Employee [ID=" + getId() + 
                           ", Name=" + getName() + 
                           ", Salary=" + getSalary() + ", bonus=" + getBonus() + "]");

    
}
}