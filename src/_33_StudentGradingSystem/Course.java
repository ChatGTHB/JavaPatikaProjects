package _33_StudentGradingSystem;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    float grade;
    float oralGrade;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        float grade = 0.0f;
        float oralGrade = 0.0f;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equalsIgnoreCase(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Teacher and course parts do not match.");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }
}
