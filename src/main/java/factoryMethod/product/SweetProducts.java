package factoryMethod.product;

public class SweetProducts implements IProduct {
    @Override
    public String getProductCategory() {
        return "This is a Sweet";
    }
}
