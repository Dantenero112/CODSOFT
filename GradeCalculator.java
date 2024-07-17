import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        // Input the marks for each subject
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        
        // Calculate percentage
        double percentage = (double) totalMarks / (numSubjects * 100) * 100;
        
        // Determine the grade based on percentage
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        // Display results
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}  