import java.util.Scanner;
public class Employee{
    
    int employeeId;
    String employeeName;
    String designation;
    double monthlySalary;
    double weeklySalary=monthlySalary/4;

    Scanner sc=new Scanner(System.in);
    Scanner sc1= new Scanner(System.in);

    void employeeDetails(){
    System.out.println("Enter the employee id:");
    employeeId=sc.nextInt();

    System.out.println("Enter the employee name:");
    employeeName=sc1.nextLine();

    System.out.println("Enter the employee designation:");
    designation=sc1.nextLine();

    }

    class HourlyEmployee extends Employee{
        
        double hourlyRate;
        int hoursWorked;
        void  calcEarning(){
             System.out.println("enter the hourly rate:");
             hourlyRate=sc.nextDouble();
             System.out.println("enter the hours worked:");
             hoursWorked=sc.nextInt();

            double weeklyEarning = hourlyRate*hoursWorked;
            System.out.println("weekly earning is: "+weeklyEarning);


        }
    }
    class SalariedEmployee extends Employee{
        
        void calcSalary(){
             System.out.println("enter the monthly rate:");
            monthlySalary=sc.nextDouble();

           double weeklySalary=monthlySalary/4;
           System.out.println("weekly salary is:" +weeklySalary);

           
        }
    }
    void display(){
        System.out.println("Employee id is:"+ employeeId);
        System.out.println("Employee name is:"+ employeeName);

        System.out.println("Employee designation is:"+ designation);
        
        

    }


    

  
 public static void main (String args[]){
 Employee obj =new Employee();
 obj.employeeDetails();
 

 Employee.HourlyEmployee obj1=obj.new HourlyEmployee();
Employee.SalariedEmployee obj2=obj.new SalariedEmployee();

 obj1.calcEarning();
 obj2.calcSalary();
 obj.display();
 }
}



