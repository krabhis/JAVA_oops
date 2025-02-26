/*
 *In Java, generics refer to a feature that allows classes and methods to operate on objects of various types while providing compile-time type safety. Generics enable you to define classes, interfaces, and methods that operate on parameters to be specified with a type, known as type parameters.
 */














import java.util.ArrayList;  
import java.util.List;  
public class TypeInference {  
    public static void showList(List<Integer>list){  
        if(!list.isEmpty()){  
            list.forEach(System.out::println);  
        }else System.out.println("list is empty");  
    }  
    public static void main(String[] args) {  
        // An old approach(prior to Java 7) to create a list  
        List<Integer> list1 = new ArrayList<Integer>();  
        list1.add(11);  
        showList(list1);  
        // Java 7    
        List<Integer> list2 = new ArrayList<>(); // You can left it blank, compiler can infer type  
        list2.add(12);  
        showList(list2);  
        // Compiler infers type of ArrayList, in Java 8  
        showList(new ArrayList<>());  
    }  
}  