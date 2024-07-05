 class Employee {
     String name;
     int salary;

    // Parameterized constructor
    public Employee(String name, int salary) {
        this.name = name; // 'this.name' refers to the instance variable
        this.salary = salary; // 'this.salary' refers to the instance variable
    }

    // Method to display employee details
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }

   
}

public class ConstructorDemo{
    public static void main(String[] args) {
        Employee emp = new Employee("John", 50000);
        emp.display();
    }
}


/*
 Construntor--->

 In Java, a constructor is a special method that is called when an object is instantiated. It is used to initialize the object’s state. Constructors have the same name as the class and do not have a return type, not even void.

 Types of Constructors
1. Default Constructor
2. Parameterized Constructor
3. Copy Constructor (Not natively supported but can be implemented)



While 'this' can be used for clarity, it is not required when there is no ambiguity between local variables, parameters, and instance variables. Omitting this does not change the behavior or functionality of the code.


public class Employee {
    private String name;
    private int salary;

    // Parameterized constructor
    public Employee(String name, int salary) {
        this.name = name;     // 'this.name' refers to instance variable
        this.salary = salary; // 'this.salary' refers to instance variable
    }

    // Method to display employee details
    public void display() {
        System.out.println("Name: " + name);    // 'name' refers to instance variable
        System.out.println("Salary: " + salary);// 'salary' refers to instance variable
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John", 50000);
        emp.display(); // Method call does not require 'this'
    }
}


=> In Java, you can use any valid identifier instead of this.name to refer to instance variables within the same class. The use of this.name is a convention to explicitly indicate that you are referring to the instance variable name of the current object. However, it is not mandatory to use this if there is no ambiguity in the context of the code.

Consider the following modified Employee class where different identifiers are used instead of this.name:


public class Employee {
    private String employeeName; // Using 'employeeName' instead of 'name'
    private int employeeSalary;  // Using 'employeeSalary' instead of 'salary'

    // Parameterized constructor
    public Employee(String name, int salary) {
        employeeName = name;     // Assigning 'name' to 'employeeName'
        employeeSalary = salary; // Assigning 'salary' to 'employeeSalary'
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee Name: " + employeeName);    // Using 'employeeName'
        System.out.println("Employee Salary: " + employeeSalary);// Using 'employeeSalary'
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John", 50000);
        emp.display();
    }
}


 */