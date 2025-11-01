package data_students;

public class Student {

    private int Id;
    private double GPA;
    private String name;
    private String level;
    private String[] Caurses;
    public static int Counter = 0;

    public Student(double GPA, String name, String level, String[] Caurses) {
        Id = ++Counter;
        this.GPA = GPA;
        this.name = name;
        this.level = level;
        this.Caurses = Caurses;
    }

    public Student() {
        Id = ++Counter;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        if (GPA > 0 && GPA < 4) {
            this.GPA = GPA;
        } else {
            System.out.println("not vaild GPA");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != "") {
            this.name = name;
        } else {
            System.out.println("not vaild name");
        }
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        if (level.equals("1") || level.equals("2") || level.equals("3") || level.equals("4")) {
            this.level = level;
        } else {
            System.out.println("not vaild level");

        }
    }

    public String[] getCaurses() {
        return Caurses;
    }

    public void setCaurses(String[] Caurses) {
        if (Caurses.length >= 2 && Caurses.length <= 7) {
            this.Caurses = Caurses;
        } else {
            System.out.println("not valid num caurses");
        }

    }

    public void Display() {
        System.out.println(UI.Cyan+"+==============================================+");
        System.out.println(UI.Cyan+"|              🎓 STUDENT DETAILS              |");
        System.out.println(UI.Cyan+"+----------------------------------------------+");
        System.out.printf(UI.Cyan+"| Name  : %-35s |\n"+UI.Reset, name);
        System.out.printf(UI.Cyan+"| GPA   : %-35.2f |\n"+UI.Reset, GPA);
        System.out.printf(UI.Cyan+"| Level : %-35s |\n"+UI.Reset, level);
        System.out.println(UI.Cyan+"|----------------------------------------------|");
        System.out.println(UI.Cyan+"| Courses:                                     |");
        for (String course : Caurses) {
            System.out.printf(UI.Cyan+"|  - %-40s |\n"+UI.Reset, course);
        }
        System.out.println(UI.Cyan+"+==============================================+"+UI.Reset);

    }

    public static void DisplayAll(Student[] students) {
        System.out.println(UI.Cyan+"+====================================================================================+");
        System.out.println(UI.Cyan+"| ID |          Name           |  GPA  | Level |            Courses                 |");
        System.out.println(UI.Cyan+"+------------------------------------------------------------------------------------+");
        for (Student s : students) {
            StringBuilder courses = new StringBuilder();
            for (String c : s.Caurses) {
                courses.append(c).append(", ");
            }
            if (courses.length() > 0) {
                courses.setLength(courses.length() - 2);
            }
            System.out.printf(UI.Cyan+"| %-2d | %-22s | %-5.2f |  %-4s | %-33s |\n"+UI.Reset,
                    s.getId(), s.getName(), s.getGPA(), s.getLevel(), courses.toString());
        }
        System.out.println(UI.Cyan+"+====================================================================================+"+UI.Reset);
    }
}
