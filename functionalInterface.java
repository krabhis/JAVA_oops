/*
An Interface that contains exactly one abstract method is known as functional interface. It can have any number of default, static methods but can contain only one abstract method.It can also declare methods of object class.
A functional interface is an interface with a single abstract method (SAM), but it can still include default methods, static methods, and methods from the Object class without affecting its status as a functional interface

=> A functional interface can have methods of object class. Example is given below---


=>A class method is a special type of method in a class that is related to the class itself, rather than to instances of the class. Think of it as a tool that belongs to the class as a whole, not to any single object made from that class.

=>Calling class methods without creating an instance.

@FunctionalInterface
public interface MyFunctionalInterface {
    // Single abstract method
    void doSomething();
    
    // Methods from Object class
    boolean equals(Object obj);
    String toString();
    int hashCode();
    
    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
    
    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

 */
@FunctionalInterface
 interface sayable{
    void say(String msg);

 }


public class functionalInterface implements sayable {
    @Override
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {  
        functionalInterface fie=new functionalInterface();
        fie.say("Hello there");  
    
    }

}
