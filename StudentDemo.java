// Student class definition
class Student {
    // Data Members
    private int rollNum;
    private String studName;
    private int mark1, mark2, mark3;
    private int totalMarks;

    // Method to set student details
    public void setStudentDetails(int rollNum, String studName, int mark1, int mark2, int mark3) {
        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Method to calculate total marks
    public void calculateTotal() {
        totalMarks = mark1 + mark2 + mark3;
    }

    // Method to display student details
    public void displayStudDetails() {
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Student Name: " + studName);
        System.out.println("Total Marks: " + totalMarks);
    }
}

// StudentDemo class to test Student class
public class StudentDemo {
    public static void main(String[] args) {
        // Create an object of Student
        Student student1 = new Student();

        // Set details for the student
        student1.setStudentDetails(101, "Raj", 85, 90, 88);

        // Calculate the total marks
        student1.calculateTotal();

        // Display the student details
        student1.displayStudDetails();
    }
}
