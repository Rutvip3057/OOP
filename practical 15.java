class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String projectName;

    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Amit", "HR");
        Manager m = new Manager("Priya", "IT", 8, "AI Project");

        e.displayDetails();
        System.out.println();
        m.displayDetails();

        System.out.println();
        Employee ref = new Manager("Rohit", "Finance", 5, "Audit System");
        ref.displayDetails();
    }
}