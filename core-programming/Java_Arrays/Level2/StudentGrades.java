
    import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = 0;

        while (true) {
            try {
                System.out.print("Enter the number of students: ");
                numStudents = Integer.parseInt(scanner.nextLine());

                if (numStudents <= 0) {
                    System.out.println("Please enter a positive integer.");
                } else {
                    break; 
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }

       
        int[][] marks = new int[numStudents][3]; 
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                marks[i][j] = getValidMarks(scanner, "Enter " + subject + " marks (out of 100): ");
            }

            
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            grades[i] = getGrade(percentages[i]);
        }

     
        System.out.println("\nStudent Report:");
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-8s%n", "Physics", "Chemistry", "Maths", "Total", "Percentage", "Grade");
        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.printf("%-10d %-10d %-10d %-10d %-12.2f %-8c%n", 
                marks[i][0], marks[i][1], marks[i][2], total, percentages[i], grades[i]);
        }

        scanner.close(); 
    }

    private static int getValidMarks(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = Integer.parseInt(scanner.nextLine());

                if (value < 0 || value > 100) {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                } else {
                    return value; 
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
    }

    private static char getGrade(double percentage) {
        if (percentage >= 80) return 'A';
        else if (percentage >= 70) return 'B';
        else if (percentage >= 60) return 'C';
        else if (percentage >= 50) return 'D';
        else if (percentage >= 40) return 'E';
        else return 'R';
    }
}


