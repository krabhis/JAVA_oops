import java.util.ArrayList;         // Import List from java.util package
import java.util.List;    // Import ArrayList from java.util package

public class StreamDemo {
    int price;
    String name;
    int model;

    public StreamDemo(int price, String name, int model) {
        this.price = price;
        this.name = name;
        this.model = model;
    }

    public static void main(String[] args) {
        // Use List<> instead of java.awt.List which is for GUI components
        List<StreamDemo> productList = new ArrayList<>();

        productList.add(new StreamDemo(1, "HP Laptop", 25000));  
        productList.add(new StreamDemo(2, "Dell Laptop", 30000));  
        productList.add(new StreamDemo(3, "Lenovo Laptop", 28000));  
        productList.add(new StreamDemo(4, "Sony Laptop", 28000));  
        productList.add(new StreamDemo(5, "Apple Laptop", 90000));  

        List<Integer> productPriceList = new ArrayList<>(); // Use Integer instead of Float

        for (StreamDemo product : productList) {
            if (product.price > 3000) {
                productPriceList.add(product.price);
            }
        }

        System.out.println(productPriceList);
    }
}
