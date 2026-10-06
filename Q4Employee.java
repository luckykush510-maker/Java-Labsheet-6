 class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 30000;
    }
}

class HRManager extends Employee {
    void work() {
        System.out.println("HR Manager is working");
    }

    void addEmployee() {
        System.out.println("Employee added");
    }
}

public class Q4Employee {
    public static void main(String[] args) {
        HRManager h = new HRManager();
        h.work();
        System.out.println("Salary = " + h.getSalary());
        h.addEmployee();
    }
}
