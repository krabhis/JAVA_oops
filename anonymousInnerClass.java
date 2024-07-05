

class A  
{
    public void show()
    {
      System.out.println("in A show");  
    }
}

/*
=>Instead of extending A class in B and overidding methods we can make annonymous inner class and method overrinding vahin pe krte hai


 class B extends A
{
    public void show()
    {
        System.out.println("in  b show ");
    }
}

 */
public class anonymousInnerClass {
    public static void main(String[] args) {
        // A obj = new B()
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("in anonymous show");
            }
        };
        obj.show();
    }
}



/*

An annoynous inner class is the unnamed local class that can extend another class or implement an interface.
 
In the revised example, an anonymous inner class is created to override the show() method of A, demonstrating the typical use of anonymous inner classes to provide specific method implementations



The new A() creates an instance of A, but the curly braces {} define an anonymous class that overrides the show() method.

A obj = new A() {
    @Override
    public void show() {
        System.out.println("in anonymous show");
    }
};


 */