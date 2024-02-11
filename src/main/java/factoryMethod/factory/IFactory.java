package factoryMethod.factory;

import factoryMethod.product.IProduct;

public interface IFactory {
    IProduct getProduct(String product);
}
