package factoryMethod.product;

public class FoodProducts implements IProduct {

    @Override
    public String getProductCategory() {
        return "This is a Food";
    }
}
