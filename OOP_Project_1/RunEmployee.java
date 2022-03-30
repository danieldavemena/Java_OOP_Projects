/*
Daniel Dave B. Meña
BSCPE202
*/

import java.util.*;

public class RunEmployee {

    public static void main(String[] args) {
       
        // Scanner and Objects Initialized
        Scanner sc = new Scanner(System.in);
        Employee em = new Employee();
        FullTimeEmployee f = new FullTimeEmployee();
        PartTimeEmployee p = new PartTimeEmployee();

        // Setting Employee Name
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        em.setName(name);

        // Asks User if Full Time or Part Time
        System.out.print("Press F for Full Time or P for Part Time: ");
        char type = sc.next().charAt(0);

        if(type == 'F') { // Process if Full Time
            // Asks for User's Monthly Salary
            System.out.print("Enter monthly salary: ");
            double salary = sc.nextDouble();
            f.setMonthlySalary(salary);
            
            // Outputs Name and Monthly Salary
            System.out.printf("Name: %s\n", em.getName());
            System.out.printf("Salary: %.2f\n", f.getMonthlySalary());

        } else if(type == 'P') { // Process if Part Time
            // Asks for User's Rate per Hour and Hours Worked
            System.out.print("Enter rate per hour and no. of hours worked separated by space: ");
            sc.nextLine(); // Skips a Line for Scanner to work
            String wage = sc.nextLine();

            // String to Double and Int Conversion
            String[] a = wage.split(" ");            
            double rate = Double.parseDouble(a[0]);
            int hour = Integer.parseInt(a[1]);
            p.setWage(rate, hour);

            //Outputs Name and Wage
            System.out.printf("Name: %s\n", em.getName());
            System.out.printf("Wage: %.2f\n", p.getWage());
        } 
    }
}