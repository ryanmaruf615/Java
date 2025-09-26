package Employee_Management_System;

public class FullTimeEmployee extends Employee implements Payable{

    private double bonus;

    public FullTimeEmployee(int id, String name, double salary,double bonus) {
        super(id, name, salary);
        this.bonus = bonus;   
    }

    public double getBonus()
    {  
         return bonus; 
    }
    public void setBonus(double bonus)
    {   
        this.bonus = bonus ; 
    }

    @Override
    public double calculatePay()
    { 
        return getSalary() + bonus ;
    } 
    
    @Override
    public void displayDetails() {
        System.out.println("Full-Time Employee [ID=" + getId() + 
                           ", Name=" + getName() + 
                           ", Basic Salary=" + getSalary() + 
                           ", bonus=" + getBonus() + 
                           ", Total Salary=" + calculatePay() + 
                           "]");

                        }
    

}