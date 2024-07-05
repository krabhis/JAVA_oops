import java.util.*;


public class setMethods {
    public static void main(String[] args) {
        Set<Integer> data = new LinkedHashSet<Integer>();
        data.add(31);
        data.add(21);
        data.add(34);
        data.add(3134);
        data.add(3133);
        data.add(314);

        System.out.println("data"+ data);

        ArrayList<Integer> newdata=new ArrayList<Integer>();
        newdata.add(32);
        newdata.add(42);
        newdata.add(52);

        data.addAll(newdata);
        System.out.println("Set"+ data);





    }

    
}
