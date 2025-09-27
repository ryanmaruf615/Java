package Employee_Management_System;

public class PartTimeEmployee extends Employee implements Payable{

    private int hoursWorked ;
    private double hourlyRate;


    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked)
    {
        super(id,name,0);
        this.hourlyRate= hourlyRate ;
        this.hoursWorked=hoursWorked;
    }

    public void setHourlyRate(double hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate()
    {
        return hourlyRate;
    }
    
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    public int getHoursWorked() {
        return hoursWorked;
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
