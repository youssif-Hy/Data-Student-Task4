package data_students;

import java.io.Console;

public class Validtiont {
    public static int ValidOption(String option, int min, int max) {
        int optionInt = 0;
        while (true) {

            try {
                optionInt = Integer.parseInt(option);
                if (optionInt >= min && optionInt <= max) {
                    return optionInt;
                } else {
                    System.out.println(UI.Red + "Invalid option. Please select a valid option between " + min + " and " + max + "." + UI.Reset);
                    System.out.print("Please select an option: ");
                    option = new java.util.Scanner(System.in).nextLine();
                }

            } catch (NumberFormatException e) {
                System.out.println(UI.Red + "Invalid input. Please enter a number." + UI.Reset);
                System.out.print("Please select an option: ");
                option = new java.util.Scanner(System.in).nextLine();
            }
        }
    }
    public static String ValiDataName(String name){
        String title = "invalid name, Please enter a valid name (at least 8 characters,first and last name must be more than 3 characters) ,try again. ";
        while (true){
            // التحقق من طول الاسم ووجود مسافة بين الاسم الأول والاسم الأخير
            if (name.length() > 7 && name.contains("")){
                // تقسيم الاسم إلى أجزاء باستخدام المسافة كفاصل
                String[] nameParts = name.split(" ");
                // التحقق من أن الاسم الأول والاسم الأخير يتكونان من أحرف فقط وطولهما أكبر من 3 أحرف
                if (nameParts[0].length() > 3 && nameParts[0].chars().allMatch(Character::isLetter) && nameParts[1].length() > 3 && nameParts[1].chars().allMatch(Character::isLetter)){
                    return name;
                }
                // إذا لم يكن الاسم صالحًا، يطلب من المستخدم إدخال اسم آخر
                else{
                    System.out.println(title);
                    name = Data_Students.input.nextLine();
                }
            }
            // إذا لم يكن الاسم صالحًا، يطلب من المستخدم إدخال اسم آخر
            else{
                
                System.out.println(title);
                name = Data_Students.input.nextLine();
            }
        }
    }
    public static double ValidGPA(String gpa){
        double gpaDouble = 0.0;
        String title = "Invalid GPA, Please enter a valid GPA between 0.0 and 4.0, try again.";
        while (true){
            try {
                gpaDouble = Double.parseDouble(gpa);
                if (gpaDouble >= 0.0 && gpaDouble <= 4.0){
                    return gpaDouble;
                }
                else{
                    System.out.println(title);
                    gpa = Data_Students.input.nextLine();
                }
            } catch (NumberFormatException e) {
                System.out.println(title);
                gpa = Data_Students.input.nextLine();
            }
        }
    }
    public static String ValidLevel(String level){
        String title = "Invalid level, Please enter a valid level (1, 2, 3, or 4), try again.";
        while (true){
            if (level.equals("1") || level.equals("2") || level.equals("3") || level.equals("4")){
                return level;
            }
            else{
                System.out.println(title);
                level = Data_Students.input.nextLine();
            }
        }
    }
    public static String ValidCourses(String coursesInput){
        String title = "Invalid course, please enter valid courses :";
        while (true){
            if (coursesInput.length() >= 2 && !coursesInput.contains("  ")){
                return coursesInput;
            }
            else{
                System.out.println(title);
                coursesInput = Data_Students.input.nextLine();
            }
        }
    }
}
