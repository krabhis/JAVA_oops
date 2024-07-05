
interface A{

    //we also declare variable in interface but they are by default final and static 
    // int age=44;
    // String area="Noida";
    // Java allows a class to implement multiple interfaces but not extend multiple classes.
    void show();
    void config();
}

class B implements A{
    @Override 
    public void show()
    {
        System.out.println("in show...");
    }
    @Override 
    public void config(){
        
        System.out.println("in config");
    }
}




public class interfacejava {
    public static void main(String[] args) {
        A obj;
        obj=new B();
        obj.show();
        obj.config();
        // A.area="mumbai";     //we cannot change as it is final and static

        // System.out.println(A.area);
    }
    
}









/*
 =>It is different from abstarct class ,it is not a class.
 =>It is use when the methods inside class is declared only.
 =>We not use extends when we inherit methods inside interface  instead of this we use impliments .
 =>Methods inside interface no need to write class.
 => Interfaces are widely used in Java to achieve abstraction, multiple inheritance of type, and to establish a contract between different object

=>interfaces cannot be instantiated directly because they only provide method declarations without implementations.
Instantiate a class that implements the interface: This is the standard way to use interfaces, by creating concrete classes that implement the interface.

=>Anonymous classes and lambda expressions: Provide more flexible ways to instantiate interfaces, especially useful for short-term, one-off implementations and functional interfaces.


=> interface is also used to make application loosely coupled (generalise ) 

=>The interface allows multiple classes to implement it in their own way, providing flexibility and promoting code reuse.

=>Polymorphism: The same interface method makeSound() in animal class is used polymorphically, enhancing the ability to handle different implementations uniformly due to which any animal can use makesound() method according to their implementation

 */