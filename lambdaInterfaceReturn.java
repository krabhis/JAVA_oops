

/*

// Using functional interface:-

 @FunctionalInterface
interface A
{
    int add(int i,int j);
}
public class lambdaInterfaceReturn {
    public static void main(String[] args) 
    {
        A obj=new A()
        {
            public int add(int i,int j)
            {
                return i+j;
            }
        };
        int result=obj.add(5,4);
        System.out.println(result);
    }
    
}

 */

//  Using lambda Expression

 @FunctionalInterface
interface A
{
    int add(int i,int j);
}
public class lambdaInterfaceReturn {
    public static void main(String[] args) 
    {
        A obj=(int i,int j)->
            {
                return i+j;
            };
            // You can remove curly braces and the return keyword if the lambda body is a single expression.
        //A obj = (int i, int j) -> i + j;
        int result=obj.add(5,4);
        System.out.println(result);
    }
    
}
