package data_students;

import java.util.Scanner;
import javax.xml.validation.Validator;

public class Data_Students {
    public static Scanner input = new Scanner(System.in);
    public static Student S1 = new Student();
    public static Student[] students;
    public static void main(String[] args) {
        menuStudent();
    }
    public static void menuStudent() {
        int option;
        do {
            option = Menu.displayMenu();
            switch (option) {
                case 1:
                    menuAddStudent();
                    break;
                case 2:
                    menuViewStudents();
                    break;
                case 0:
                    System.out.println(UI.Green + "Exiting the program. Goodbye!" + UI.Reset);
                    System.exit(0);
                    break;
                default:
                    System.out.println(UI.Red + "Invalid option. Please try again." + UI.Reset);
            }
        } while (true);
    }
    public static void  menuAddStudent() {
        int option;
        do {
            option = Menu.displayAddStudentMenu();
            switch (option) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    students=addArrayOfStudents();
                    break;
                case 3:
                    menuStudent();
                    break;
                default:
                    System.out.println(UI.Red + "Invalid option. Please try again." + UI.Reset);
            }
        } while (true);
    }
    public static void menuViewStudents() {
        int option;
        do {
            option = Menu.displayViewStudentsMenu();
            switch (option) {
                case 1:
                    S1.Display();
                    break;
                case 2:
                    if (students == null || students.length == 0) {
                        System.out.println(UI.Yellow + "No students available to display." + UI.Reset);
                        break;
                    }
                    Student.DisplayAll(students);
                    // Code to view all students
                    break;
                case 3:
                    menuStudent();
                    break;
                default:
                    System.out.println(UI.Red + "Invalid option. Please try again." + UI.Reset);
            }
        } while (true);
    }
    public static void addStudent() {
        System.out.println(UI.Green + "===== Add New Student =====" + UI.Reset);
        
        System.out.print("Enter student Name: ");
        S1.setName(Validtiont.ValiDataName(Data_Students.input.nextLine()));
        System.out.print("Enter student GPA: ");
        S1.setGPA(Validtiont.ValidGPA(Data_Students.input.nextLine()));
        System.out.print("Enter student Level: ");
        S1.setLevel(Validtiont.ValidLevel(Data_Students.input.nextLine()));
        int countcourses=2;
        String []courseName = new String [7];
        for(int i=0;i<countcourses;i++){
            System.out.print("Enter course "+(i+1)+" name: ");
             courseName[i] = Validtiont.ValidCourses(Data_Students.input.nextLine());
        }
        S1.setCaurses(courseName);
        System.out.println(UI.Green + "Student added successfully!" + UI.Reset);
    }
    public static  Student[] addArrayOfStudents() {
        System.out.println(UI.Green + "===== Add Array of Students =====" + UI.Reset);
        System.out.print("Enter number of students to add: ");
        int numStudents = Validtiont.ValidOption(Data_Students.input.nextLine(), 1, 100);
        Student[] students = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.println(UI.Green + "----- Adding Student " + (i + 1) + " -----" + UI.Reset);
            students[i] = new Student();
            System.out.print("Enter student Name: ");
            students[i].setName(Validtiont.ValiDataName(Data_Students.input.nextLine()));
            System.out.print("Enter student GPA: ");
            students[i].setGPA(Validtiont.ValidGPA(Data_Students.input.nextLine()));
            System.out.print("Enter student Level: ");
            students[i].setLevel(Validtiont.ValidLevel(Data_Students.input.nextLine()));
            int countcourses=2;
            String []courseName = new String [7];
            for(int j=0;j<countcourses;j++){
                System.out.print("Enter course "+(j+1)+" name: ");
                 courseName[j] = Validtiont.ValidCourses(Data_Students.input.nextLine());
            }
            students[i].setCaurses(courseName);
            System.out.println(UI.Green + "Student " + (i + 1) + " added successfully!" + UI.Reset);
            
        }
        return students;
    }
}
