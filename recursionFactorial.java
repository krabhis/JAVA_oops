public class recursionFactorial {
    static int factorial(int n){
        if(n==1)
        return 1;
        else
        return (n*factorial(n-1));
    }
    

public static void main(String[] args){
    System.out.println("factorial is :"+factorial(5));
}
}



// Garbage collection in java 
/*garbage means unreferenced objects garbage collection is process of reclaiming the runtime unused memory automatically in othefr words  it is the way to destrop the unused objects . To do show we use free( function ) in c and delete function in c in cpp . But in java it is performed automatically . So java provides better memeory management  
 it makes java memeory efficient because garbage collector removes th unreferenced objects from the heap memory 
 it is automatically done by by the garbage collector (a part of jvm ) so we dont need to make extra efforts
 gc method(the gc funtion ois use dto invoke the garbage collector in java to p[erform the cleanup processing . the gc ( is found iin sysytem and runtime classes 
 public static void )])
*/