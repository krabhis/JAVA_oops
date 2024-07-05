
class A 
{
    int age;
    public void show()
    {
        System.out.println("in show");
    }
    
    class B 
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}



public class innerClass {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();

        A.B obj1=obj.new B();
        obj1.config();
    }
    
}



// You can only make inner class a static class. A static class in Java is a nested class (a class within another class) that is declared with the static keyword Below is example of nested static class and its instanciation.

/*
 
class A 
{
    int age;
    public void show()
    {
        System.out.println("in show");
    }
    
     static class B 
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}



public class innerClass {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();

        A.B obj1=.new A.B();
        obj1.config();
    }
    
}

 */