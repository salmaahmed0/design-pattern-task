package factoryMethod.factory;

import factoryMethod.product.DrinkProducts;
import factoryMethod.product.FoodProducts;
import factoryMethod.product.IProduct;
import factoryMethod.product.SweetProducts;

public class ProductFactory implements IFactory{
    @Override
    public IProduct getProduct(String product) {

         switch (product) {
             case "Water", "Juice", "Coffee" : return new DrinkProducts();
             case "Pizza", "Pasta" : return new FoodProducts();
             case "Donut", "Cake" : return new SweetProducts();
        };
         return null;
    }
}
