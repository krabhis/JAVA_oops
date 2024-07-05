
abstract class Car{
    public abstract void drive();

    public void playmusic(){
    System.out.println("play music...");
   }


}

class WagonR extends Car{
    @Override //writing override is not mandatory but some time it shows and error and it is written fir the shake of clarity
    public void drive(){
        System.out.println("Driving...");
    }
}

public class abstractclass {
    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.drive();
        obj.playmusic();
    }
    
}




/*Abstract class in Java
A class that is declared with abstract keyword is known as abstract class in java. It can have 
abstract and non-abstract methods (method with body). It needs to be extended and its method 
implemented. It cannot be instantiated(means abstract class ka object nhi banta)

=>jab hum object banate hai to wo abstract class ka nhi balki subclass ka banate hai
=>it is not mandatory that abstract class should have only abstract method ... and you can create more than onde abstract method in one abstract class.


/* Abstract classes define methods that must be implemented by any subclass. This ensures that all subclasses share a common interface, promoting consistency across different implementations.*/
____________________

// abstract class Bike
// { 
// abstract void run(); 
// } 
// class Honda4 extends Bike{ 
// void run()
// {
//     System.out.println("running safely..");
// } 
// public static void main(String args[]){ 
// Bike obj = new Honda4(); 
// obj.run();
// } 
//  }

// */