package _33_StudentGradingSystem;

public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String number;
    String classes;
    float average;
    boolean isPass;

    public Student(String name, String number, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.number = number;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0f;
        this.isPass = false;
    }

    void addBulkExamGrade(float grade1, float oralGrade1, float grade2, float oralGrade2, float grade3, float oralGrade3) {

        if (grade1 >= 0 && grade1 <= 100 && oralGrade1 >= 0 && oralGrade1 <= 100) {
            this.course1.grade = grade1 * 60 / 100 + oralGrade1 * 40 / 100;
        } else {
            System.out.println("Written or spoken grade could not be calculated because it was entered incorrectly");
        }

        if (grade2 >= 0 && grade2 <= 100 && oralGrade2 >= 0 && oralGrade2 <= 100) {
            this.course2.grade = grade2 * 80 / 100 + oralGrade2 * 20 / 100;
        } else {
            System.out.println("Written or spoken grade could not be calculated because it was entered incorrectly");
        }

        if (grade3 >= 0 && grade3 <= 100 && oralGrade3 >= 0 && oralGrade3 <= 100) {
            this.course3.grade = grade3 * 70 / 100 + oralGrade1 * 30 / 100;
        } else {
            System.out.println("Written or spoken grade could not be calculated because it was entered incorrectly");
        }
    }

    void isPass() {

        this.average = (this.course1.grade + this.course2.grade + this.course3.grade) / 3.0f;

        System.out.println("Grade Point Average = " + this.average);

        if (this.average >= 55) {
            System.out.println("Passed");
            this.isPass = true;
        } else {
            System.out.println("Failed");
            this.isPass = false;
        }
    }

    void printGrade() {
        System.out.println(course1.name + "'s Grade\t:\t" + course1.grade);
        System.out.println(course2.name + "'s Grade\t:\t" + course2.grade);
        System.out.println(course3.name + "'s Grade\t:\t" + course3.grade);
    }
}
