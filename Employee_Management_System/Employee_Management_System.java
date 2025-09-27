package Employee_Management_System;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee_Management_System {
    
public static void main(String[] arg) 
{

    Scanner scanner = new Scanner(System.in);
    ArrayList<Employee> employeeList = new ArrayList<>();

    while(true)
    {
        System.out.println("===== Employee Management System ========");
         System.out.println("1. Add Full-Time Employee");
         System.out.println("2. Add Part-Time Employee");
         System.out.println("3. Display All Employees");
         System.out.println("4. Calculate Pay");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");

         int choice = scanner.nextInt();

         switch (choice) {
            case 1:
                // what i need int id, String name, double salary,double bonus
                
                System.out.print("Enter Your ID: ");
                int idFulltime =scanner.nextInt();

                System.out.print("Enter Your Name: ");
                String nameFulltime = scanner.next();

                System.out.print("Enter Your Salary: ");
                double salaryFull = scanner.nextDouble();

                System.out.print("Enter Your Bonus:");
                double bonusFull = scanner.nextDouble();

            employeeList.add(new FullTimeEmployee(idFulltime,nameFulltime,salaryFull,bonusFull)); 
                break;
            
            case 2:
                    System.out.print("Enter ID: ");
                    int pId = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String pName = scanner.next();
                    System.out.print("Enter Hourly Rate: ");
                    double rate = scanner.nextDouble();
                    System.out.print("Enter Hours Worked: ");
                    int hours = scanner.nextInt();
                    employeeList.add(new PartTimeEmployee(pId, pName, rate, hours));
                    break;

              case 3:
                    for (Employee e : employeeList) {
                        e.displayDetails();
                    }
                    break;

                case 4:
                    for (Employee e : employeeList) {
                        if (e instanceof Payable) {
                            Payable p = (Payable) e;
                            System.out.println(e.getName() + " Pay: " + p.calculatePay());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
    }





    

}

}
