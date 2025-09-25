package Employee_Management_System;

public abstract class Employee {
     private int id;
     private String name;
     private double salary;  

    // constructor
    public Employee(int id,String name,double salary)
    {
        this.id= id;
        this.name= name ;
        this.salary=salary;

    } 

    abstract void displayDetails();

    public int getId()
    {    return id; }  

    public String getName()
    {    return name; }  

    public double getSalary()
    {    return salary; }  

    public void setId(int id)
    {   this.id=id;   }  

    public void setName(String name)
    {   this.name=name;   }  

    public void setSalary(double salary)
    {   this.salary=salary;   }  

}
