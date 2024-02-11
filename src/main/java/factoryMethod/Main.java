package factoryMethod;

import factoryMethod.factory.IFactory;
import factoryMethod.factory.ProductFactory;
import factoryMethod.product.IProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();
        products.addAll(List.of("Water", "Juice", "Coffee", "Pizza", "Pasta", "Donut", "Cake"));
        System.out.println(products);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Product to know its Category : ");
        String item = in.next();

        IFactory factory = new ProductFactory();
        IProduct product = factory.getProduct(item);

        System.out.println(product.getProductCategory());

    }
}
