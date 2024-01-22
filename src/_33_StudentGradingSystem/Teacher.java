package _33_StudentGradingSystem;

public class Teacher {
    String name;
    String phoneNumber;
    String branch;

    public Teacher(String name, String phoneNumber, String branch) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }

    public void print() {
        System.out.println("Name : " + this.name);
        System.out.println("Phone : " + this.phoneNumber);
        System.out.println("Branch : " + this.branch);
    }
}
