package studentinformationsystem;

public class StudentInformationSystem {

    public static void main(String[] args) {

        String studentName = "nur ariesya";
        String studentID = "S86770";

        int mark1 = 85;
        int mark2 = 90;
        int mark3 = 70;
        int total = mark1 + mark2 + mark3;

        System.out.println("=== Student Information System ===");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);

        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Total Mark: " + total);

        if (total >= 160) {
            System.out.println("Result: Excellent");
        } else if (total >= 100) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }
}
