


@FunctionalInterface
interface A{
    void show();

}

public class lambdaExpression {
    public static void main(String[] args)
     {
        A obj=new A()
         {
//Annonymous inner class
            
                public void show()
                {
                    System.out.println("in show");

                }
            
        };
        obj.show();
    }
    
}
 


 

//  ------------------------------------------------

/*
 =>The confusion arises from a misunderstanding of how interfaces and anonymous inner classes work in Java. You are correct that you cannot instantiate an interface directly, but what you're actually seeing in the provided code is an anonymous inner class that implements the interface A.

 =>Anonymous Inner Class:

An anonymous inner class is a way to create a class and instantiate it in a single expression. This class implements the interface (or extends a class) and provides the implementations for the methods on the spot.
The syntax new A() { ... } is creating an instance of an anonymous class that implements the A interface.

 => *Yes, exactly! Lambda expressions provide a concise and more readable way to implement functional interfaces in Java. Here are some key points and examples to illustrate why and how lambda expressions are used: here is the example.

 */


 @FunctionalInterface
 interface A{
     void show();
 
 }
 
 public class lambdaExpression {
     public static void main(String[] args)
      {
         A obj=()->
                 {
                     System.out.println("in show");
 
                 }
             
         ;
         obj.show();
     }
     
 }
  
 