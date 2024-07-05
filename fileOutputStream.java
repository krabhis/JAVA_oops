/*
 java fileoutput stream is an output stream used for writing data to a file .
 --------------------------------
 If you have to write primitive values into a file, use FileOutputStream class. You can write byte-oriented as well as character-oriented data through FileOutputStream class. But, for character-oriented data, it is preferred to use FileWriter than FileOutputStream.

 -----------------------
 Let's see the declaration for Java.io.FileOutputStream class:

public class FileOutputStream extends OutputStream  


 */

 //writing byte

//  import java.io.FileOutputStream;
//  import java.io.IOException;
 
//  public class fileOutputStream {
 
//      public static void main(String[] args) {
//          try {
//              // Correct the file path and provide a file name
//              FileOutputStream fout = new FileOutputStream("C:\\Users\\abhis\\OneDrive\\Documents\\example.txt");
//              fout.write(65);
//              fout.close();  // Always close the file output stream
//              System.out.println("success...");
//          } catch (IOException e) {
//              System.out.println(e);
//          }
//      }
//  }
 
 //writing

 import java.io.FileOutputStream;  
 import java.io.IOException;
public class fileOutputStream {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
             String s="Welcome to javaTpoint.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  