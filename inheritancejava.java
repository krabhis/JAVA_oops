// // package playingWithJava;

// // Define the superclass Employee
// class Employee {
//     // Use correct capitalization for data types
//     String customerName;
//     int salary;
//     float age;

//     // Constructor
//     Employee(String customerName, int salary, float age) {
//         this.customerName = customerName;
//         this.salary = salary;
//         this.age = age;
//     }

//     // Method to display employee details
//     void display() {
//         System.out.println("Name: " + customerName);
//         System.out.println("Salary: " + salary);
//         System.out.println("Age: " + age);
//     }
// }

// // Define the subclass Abhishek
// class Abhishek extends Employee {
//     // Additional attributes for Abhishek
//     String department;

//     // Constructor
//     Abhishek(String customerName, int salary, float age, String department) {
//         super(customerName, salary, age); // Call the superclass constructor
//         this.department = department;
//     }

//     // Override display method to include department
//     @Override
//     void display() {
//         super.display(); // Call the superclass display method
//         System.out.println("Department: " + department);
//     }
// }

// // Main class to test inheritance
// public class inheritancejava {
//     public static void main(String[] args) {
//         Abhishek emp = new Abhishek("Abhishek", 50000, 25.5f, "IT");
//         emp.display();
//     }
// }


// Types of inheritance---->

// 1. Single Inheritance:

/*

 class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class inheritancejava {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}

 */

// 2. Multilevel Interferance

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class inheritancejava {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}

// 3. Hierarichal inheritance

/*
 class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}

public class inheritancejava {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}

 */

//  4.Multiple inheritance using interface

/*
 interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Bat implements Animal, Bird {
    @Override
    public void eat() {
        System.out.println("Bat is eating...");
    }

    @Override
    public void fly() {
        System.out.println("Bat is flying...");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat();
        bat.fly();
    }
}

 */