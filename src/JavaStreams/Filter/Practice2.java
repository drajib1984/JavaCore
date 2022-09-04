package JavaStreams.Filter;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Product{
    int id;
    String productName;
    double price;

    public Product(int id, String productName, double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }
}
public class Practice2 {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(1,"HP Laptop",25000));
        products.add(new Product(2,"Dell Laptop",30000));
        products.add(new Product(3,"lenovo Laptop",28000));
        products.add(new Product(4,"Sony Laptop",23000));
        products.add(new Product(5,"Apple Laptop",90000));
//print all products

        products.stream().forEach(i-> System.out.println(i.productName+"--"+i.id+"--"+i.price));

//print all products whose cost >26K

   products.stream().filter(i -> i.price > 26000).forEach(i-> System.out.println(i.productName+"__"+i.price));

    }
}
