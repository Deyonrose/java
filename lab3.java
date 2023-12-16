import java.util.Scanner;
public class Employee{
    
    int employeeId;
    String employeeName;
    String designation;
    double monthlySalary;
    double bonus;
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
    double  calculateBonus(){
        return 0;
    }
    void display(){
        System.out.println("Employee id is:"+ employeeId);
        System.out.println("Employee name is:"+ employeeName);

        System.out.println("Employee designation is:"+ designation);
    }
     public static void main (String args[])
    {
       HourlyEmployee obj1=new HourlyEmployee();
       ExecutiveEmployee obj2=new ExecutiveEmployee();
       obj1.employeeDetails();
       obj1.calcEarning();
       obj2. calcSalary();

       obj1.display();
       obj2.display();
   }
   
}
    



    class HourlyEmployee extends Employee{
        
        double hourlyRate;
        int hoursWorked;
        double weeklyEarning;
        
        void  calcEarning(){
             System.out.println("enter the hourly rate:");
             hourlyRate=sc.nextDouble();

             System.out.println("enter the hours worked:");
             hoursWorked=sc.nextInt();

            if(hourlyRate<=100 && hoursWorked<=24){

           
            weeklyEarning = hourlyRate*hoursWorked;
            calculateBonus(weeklyEarning);
            }else{
                System.out.println("hourly rate  should be less than or equal to 100 and hours worked should be less than 24");
            }


        }

        void calculateBonus(double weeklyEarning){
            super.calculateBonus();
            bonus=((weeklyEarning*0.05)+weeklyEarning);


        }
        void display(){
            super.display();

            System.out.println("The hourly rate is:"+hourlyRate);
             System.out.println("The hours worked is:"+hoursWorked);
             System.out.println("weekly earning is: "+weeklyEarning);
             System.out.println("Bonus is: "+bonus);
        }

    }
    class SalariedEmployee extends Employee
    {
        double weeklySalary;
        
        void calcSalary(){
            System.out.println("enter the monthly rate:");
            monthlySalary=sc.nextDouble();
          if(monthlySalary<=72000){

           weeklySalary=monthlySalary/4;
           calculateBonus(weeklySalary);
          }else{
            System.out.println("it should be less than 72000");

          }
        }
            void calculateBonus(double weeklySalary){
            super.calculateBonus();
            bonus=((weeklySalary*0.10)+weeklySalary);


        }
         void display(){
            
            System.out.println("The monthly rate is:"+ monthlySalary);
            System.out.println("The weekly salary is:"+weeklySalary);
            System.out.println("Bonus is: "+bonus);
        }   
    }

        class ExecutiveEmployee extends SalariedEmployee
        {
            double bonusPrecentage;
            double annualSalary;

            void calculateBonus(double monthlySalary)
            {

                annualSalary=monthlySalary*12;
                bonusPrecentage=(annualSalary*0.05);
                if(bonusPrecentage<=43200){
                
                bonus=(bonusPrecentage+annualSalary);
                }else{
                    System.out.println("it should be less than 43200");
                }

            }
            void display()
            
            {
                super.display();
                System.out.println("The annualSalary is:"+annualSalary);
                System.out.println("Bonus is: "+bonus);
            }
        }
        
        
    
    


    

  

