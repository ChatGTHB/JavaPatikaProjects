package _44_SalaryCalculation;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raiseSalary;


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.tax = tax();
        this.bonus = bonus();
        this.raiseSalary = raiseSalary();
    }

    public double tax() {
        if (this.salary > 1000) {
            this.tax = this.salary * ((double) 3 / 100);
        }
        return this.tax;
    }

    public double bonus() {
        if (this.workHours > 40) {
            this.bonus = (this.workHours - 40) * 30;
        }
        return this.bonus;
    }

    public double raiseSalary() {
        if (this.hireYear > 2001) {
            this.raiseSalary = this.salary * ((double) 5 / 100);
        } else if (this.hireYear < 2001 && this.hireYear > 1991) {
            this.raiseSalary = this.salary * ((double) 1 / 10);
        } else if (this.hireYear <= 1991) {
            this.raiseSalary = this.salary * ((double) 15 / 100);
        }
        return this.raiseSalary;
    }

    @Override
    public String toString() {
        return "Name = " + this.name + "\n" + "Salary = " + this.salary + "\n" + "Work Hours = " + this.workHours + "\n" + "Hire Year = " + this.hireYear + "\n" + "Tax = " + this.tax + "\n" + "Bonus = " + this.bonus + "\n" + "Raise Salary = " + this.raiseSalary + "\n" + "Salary Without Raise With Taxes And Bonuses = " + (this.salary - this.tax + this.bonus) + "\n" + "Raised Total Salary = " + (this.salary + this.raiseSalary);
    }
}
