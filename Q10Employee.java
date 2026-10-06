abstract class Employee {
    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    double calculateSalary() {
        return 60000;
    }

    void displayInfo() {
        System.out.println("Role: Manager");
        System.out.println("Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    double calculateSalary() {
        return 50000;
    }

    void displayInfo() {
        System.out.println("Role: Programmer");
        System.out.println("Salary: " + calculateSalary());
    }
}

public class Q10Employee {
    public static void main(String[] args) {
        Manager m = new Manager();
        Programmer p = new Programmer();

        m.displayInfo();
        p.displayInfo();
    }
}
