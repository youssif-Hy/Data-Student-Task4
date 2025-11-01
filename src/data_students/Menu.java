package data_students;
public class Menu {
    public static int displayMenu() {
        System.out.println(UI.Green + "===== Student Management System =====" + UI.Reset);
        System.out.println("1. Add Student Menu");
        System.out.println("2. View Students Menu" );
        System.out.println("0. Exit");
        System.out.print(UI.Gray + "Please select an option (0-2): " + UI.Reset);
        int option = Validtiont.ValidOption(Data_Students.input.nextLine(), 0, 2);
        return option;
    }
    public static int displayAddStudentMenu() {
        System.out.println(UI.Green + "===== Add Student Menu =====" + UI.Reset);
        System.out.println("1. Add New Student");
        System.err.println("2. Add Array of Students");
        System.out.println("3. Back to Main Menu");
        System.out.print(UI.Gray + "Please select an option (1-3): " + UI.Reset);
        int option = Validtiont.ValidOption(Data_Students.input.nextLine(), 0, 3);
        return option;
    }
    public static int displayViewStudentsMenu() {
        System.out.println(UI.Green + "===== View Students Menu =====" + UI.Reset);
        System.out.println("1. View  Student");
        System.out.println("2. View All Students");
        System.out.println("3. Back to Main Menu");
        System.out.print(UI.Gray + "Please select an option (1-3): " + UI.Reset);
        int option = Validtiont.ValidOption(Data_Students.input.nextLine(), 0, 3);
        return option;
    }
    
}
