/*if you make a member static, you can access it without object.Static members are common for all the instances(objects) of the class but non-static members are separate for each instance of class. */


class static01
{
    // This is a static method
    static void myMethod()
    {
        System.out.println("myMethod");
    }
 
    public static void main(String[] args)
    {
          /* You can see that we are calling this
           * method without creating any object. 
           */
           myMethod();
    }
}




// https://beginnersbook.com/2013/04/java-static-class-block-methods-variables/ 