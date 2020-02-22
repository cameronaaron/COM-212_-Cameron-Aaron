import java.util.Scanner;
//Creating our student class
public class Student {
    //Takes perameters name and grade
    private String name;
    private int grade;
//Defines our names and grades
    public Student(String name0, int grade0) {
        name = name0;
        grade = grade0;
    }
    // Returns name
    public String getName() {
        return name;
    }
    //Sets the grade
    public void setGrade(int grade0) {
        grade = grade0;
    }
    //Return grade
    public int getGrade() {
        return grade;
    }

}
