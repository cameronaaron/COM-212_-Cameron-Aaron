import java.util.Scanner;

public class Studentmain {

    public static void fillArray(Student[] students) {
        Scanner one = new Scanner(System.in);
        int grades;
        String name;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name: ");
            name = one.next();
            System.out.println("Enter Grade");
            grades = one.nextInt();

            Student element = new Student(name, grades);
            students[i] = element;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        fillArray(students);
        System.out.println("Name and Grade displayed here:");
        for (int i = 0; i < 5; i++) {
            System.out.println(students[i].getName() + " " + students[i].getGrade());
        }

    }
}
