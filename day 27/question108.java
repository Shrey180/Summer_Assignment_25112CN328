import java.util.Scanner;

public class question108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Academic Marksheet Generation Terminal ---");
        System.out.print("Enter Student Full Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Examination Roll Number: ");
        String rollNo = scanner.nextLine();

        System.out.print("Enter marks for Physics (out of 100): ");
        double physics = scanner.nextDouble();
        System.out.print("Enter marks for Chemistry (out of 100): ");
        double chemistry = scanner.nextDouble();
        System.out.print("Enter marks for Mathematics (out of 100): ");
        double maths = scanner.nextDouble();

        double totalObtained = physics + chemistry + maths;
        double percentage = (totalObtained / 300.0) * 100;

        // Getting the grade via a clean separate string calculation function
        String grade = determineGrade(percentage);

        // Printing sheet layout
        printMarkSheet(name, rollNo, physics, chemistry, maths, totalObtained, percentage, grade);

        scanner.close();
    }

    // Simple function to isolate grade classification logic
    public static String determineGrade(double percentage) {
        if (percentage >= 90) return "A+ (Excellent)";
        else if (percentage >= 80) return "A (Very Good)";
        else if (percentage >= 70) return "B (Good)";
        else if (percentage >= 60) return "C (Satisfactory)";
        else if (percentage >= 40) return "D (Pass)";
        else return "F (Fail / Re-appear)";
    }

    // Isolated print template layout function
    public static void printMarkSheet(String name, String roll, double p, double c, double m, double total, double pct, String grade) {
        System.out.println("\n================================================");
        System.out.println("          OFFICIAL ACADEMIC MARKSHEET           ");
        System.out.println("================================================");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + roll);
        System.out.println("------------------------------------------------");
        System.out.println("SUBJECT                  MAX MARKS     OBTAINED ");
        System.out.println("------------------------------------------------");
        System.out.println("Physics                  100           " + p);
        System.out.println("Chemistry                100           " + c);
        System.out.println("Mathematics              100           " + m);
        System.out.println("------------------------------------------------");
        System.out.println("AGGREGATE TOTAL:        300           " + total);
        System.out.printf("FINAL PERCENTAGE:                      %.2f%%\n", pct);
        System.out.println("CONSOLIDATED GRADE:                    " + grade);
        System.out.println("================================================");
    }
}