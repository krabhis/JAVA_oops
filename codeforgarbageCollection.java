public class codeforgarbageCollection{ 
    public void finalize()
    {
        System.out.println("object is garbage collected");
    } 
    public static void main(String args[]){ 
    codeforgarbageCollection s1=new codeforgarbageCollection(); 
    codeforgarbageCollection s2=new codeforgarbageCollection(); 
    s1=null; 
    s2=null; 
    System.gc(); 
    } 
}
    