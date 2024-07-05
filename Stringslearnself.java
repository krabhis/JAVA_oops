public class Stringslearnself {
    
}




/*+++++++++++++NOTES+++++++++++++++++++



The java String is immutable i.e. it cannot be changed. Whenever we change any 
string, a new instance is created. For mutable string, you can use StringBuffer and StringBuilder 
classes.
There are two ways to create String object: 
1. By string literal 
2. By new keyword 

_____________________________________________________________________
 
The String class represents character strings. All string literals in Java programs, such as "abc", are implemented as instances of this class.

Strings are constant; their values cannot be changed after they are created. String buffers support mutable strings. Because String objects are immutable they can be shared




String str = "abc";

_____________________________________________


char data[] = {'a', 'b', 'c'};
                String str = new String(data);
 ________________________________________________________________


 System.out.println("abc");
                String cde = "cde";
                System.out.println("abc" + cde);
                String c = "abc".substring(2,3);
                String d = cde.substring(1, 2);
 */