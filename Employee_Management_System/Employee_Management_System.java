package Employee_Management_System;

public class Employee_Management_System {
    
public static void main(String[] arg) 
{
    FullTimeEmployee employee = new FullTimeEmployee(0, null, 0,0) ;

    
    employee.setId(1);
    employee.setName("Maruf");
    employee.setSalary(1000);
    employee.setBonus(2000);
    employee.displayDetails();

}

}
