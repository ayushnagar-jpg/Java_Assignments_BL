import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter marks for Physics: ");
        int physics = sc.nextInt();
        
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();
        
        System.out.print("Enter marks for Maths: ");
        int maths = sc.nextInt();
        
       
        double average = (physics + chemistry + maths) / 3.0;

        String grade, remarks;
        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.println("\n===== Student Report =====");
        System.out.println("Physics Marks   : " + physics);
        System.out.println("Chemistry Marks : " + chemistry);
        System.out.println("Maths Marks     : " + maths);
        System.out.println("Average Marks   : " + average);
        System.out.println("Grade           : " + grade);
        System.out.println("Remarks         : " + remarks);
        
        sc.close();
    }
}
