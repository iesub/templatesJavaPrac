package mirea.practice.prac6.factoryMethod;

public abstract class Creator {

    public enum ProductType{
        CHAIR,
        SOFA,
        TABLE,
        CAR,
        PLANE
    }

    public Product factoryOperation(ProductType type){
        Product product = factoryMethod(type);

        System.out.println(product.getName() + " собран.");
        return(product);
    }

    protected abstract Product factoryMethod(ProductType type);
}
