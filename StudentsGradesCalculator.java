import java.util.Scanner;
public class StudentsGradesCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = 5;
        Student[] students = new Student[numStudents];
        double classTotal = 0.0;
        int numSubjects = 5;

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter name for student " + (i + 1) + ":");
            String name = scanner.nextLine();

            int[] grades = new int[numSubjects];
            for (int j = 0; j < numSubjects; j++) {
                System.out.println("Enter grade " + (j + 1) + " for " + name + ":");
                grades[j] = scanner.nextInt();
            }
            scanner.nextLine();
            students[i] = new Student(name, grades);
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println();
            Student student = students[i];
            double avg = student.getAverageGrade();
            classTotal += avg;
            
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + student.getName());
            System.out.print("Grades: ");
            for (int grade : student.getGrades()) {
                System.out.print(grade + " ");
            }
            System.out.println();
            System.out.println("Average Grade: " + student.getAverageGrade());  
        }
        double classAverage = classTotal / numStudents;
        System.out.println("\nClass Average Grade: " + classAverage);
        scanner.close();
    }
}