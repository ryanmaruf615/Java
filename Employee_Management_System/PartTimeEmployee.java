package Employee_Management_System;

public class PartTimeEmployee extends Employee{

    private double hoursWorked ;

    public PartTimeEmployee(int id, String name, double salary,double hoursWorked)
    {
        super(id,name,salary);
        this.hoursWorked=hoursWorked;
    }
    
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    public double getHoursWorked() {
        return hoursWorked;
    }


@Override
    public void displayDetails() {
        System.out.println("Full-Time Employee [ID=" + getId() + 
                           ", Name=" + getName() + 
                           ", Salary=" + getSalary() + 
                           ", bonus=" + getHoursWorked() + "]");
    }

}
