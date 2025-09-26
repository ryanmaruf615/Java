package Employee_Management_System;

public class PartTimeEmployee extends Employee implements Payable{

    private double hoursWorked ;
    private double hourlyRate;


    public PartTimeEmployee(int id, String name, double salary,double hoursWorked,double hourlyRate)
    {
        super(id,name,salary);
        this.hoursWorked=hoursWorked;
        this.hourlyRate= hourlyRate ;
    }
    
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHourlyRate(double hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate()
    {
        return hourlyRate;
    }

@Override
    public double calculatePay()
    {
        return hourlyRate * hoursWorked ;
    }

@Override
    public void displayDetails() {
        System.out.println("Part-Time Employee [ ID = " + getId() + 
                           ", Name = " + getName() + 
                           ", Hourly Rate =" + getHourlyRate() + 
                           ", Worked Hours =" + getHoursWorked() + 
                           ", Salary =" + calculatePay() +

                           "]");
    }

}
