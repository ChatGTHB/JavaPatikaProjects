package _33_StudentGradingSystem;

public class StudentGradingSystem {
    public static void main(String[] args) {

        Teacher teacher1=new Teacher("Wilhelm Wundt","0123456789","PSYH");
        Teacher teacher2=new Teacher("Eukleides","0123456788","MATH");
        Teacher teacher3=new Teacher("Max Weber","0123456787","SOCI");

        Course psychology=new Course("Psychology","101","PSYH");
        psychology.addTeacher(teacher1);

        Course mathematics=new Course("Mathematics","102","MATH");
        mathematics.addTeacher(teacher2);

        Course sociology=new Course("Sociology","103","SOCI");
        sociology.addTeacher(teacher3);

        Student student1=new Student("Jason Burn","123","4",psychology,mathematics,sociology);
        student1.addBulkExamGrade(100,60,78,83,50,70);
        student1.printGrade();
        student1.isPass();

    }
}
