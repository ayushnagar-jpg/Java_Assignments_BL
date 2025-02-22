import java.util.*;
public class EmployesBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEmployees = 3; // Total number of employees
        double[] salaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];

        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;




        
        // Taking user input for salary and years of service
        for (int i = 0; i < numEmployees; i++) {
            while (true) {
                System.out.print("Enter salary for Employee " + (i + 1) + ": ");
                double salary = scanner.nextDouble();
                System.out.print("Enter years of service for Employee " + (i + 1) + ": ");
                double years = scanner.nextDouble();

                if (salary < 0 || years < 0) {
                    System.out.println("Invalid input! Salary and years of service cannot be negative. Please enter again.");
                } else {
                    salaries[i] = salary;
                    yearsOfService[i] = years;
                    break;
                }
            }
        }

        // Calculating bonuses, new salaries, and total amounts
        for (int i = 0; i < numEmployees; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];

            // Update totals
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

      //  Displaying results
        System.out.println("\nEmployee Salary Details:");
        System.out.println("------------------------------------------------------");
        System.out.printf("%-10s %-15s %-10s %-15s%n", "Employee", "Old Salary", "Bonus", "New Salary");
       System.out.println("------------------------------------------------------");

        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("%-10d %-15.2f %-10.2f %-15.2f%n", (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.println("------------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

        // Close scanner
        scanner.close();
    }
}


