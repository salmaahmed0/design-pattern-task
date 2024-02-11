package factoryMethod.product;

public class DrinkProducts implements IProduct {
    @Override
    public String getProductCategory() {
        return "This is a Drink";
    }
}
