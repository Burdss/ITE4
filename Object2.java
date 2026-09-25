class Student {
    String studentName;
    int studentNumber;
}

public class Object2 {
    public static void main(String[] args) {
        Student student = new Student();

        student.studentName = "Burds";
        student.studentNumber = 7;

        System.out.println("Student Name: " + student.studentName
                + " | Student Number: " + student.studentNumber);
    }
}
