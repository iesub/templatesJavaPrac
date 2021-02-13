package mirea.practice.prac6.factoryMethod;

public class FurnitureFactory extends Creator{
    @Override
    protected Product factoryMethod(ProductType type) {
        Product product = null;

        switch(type){
            case CHAIR:
                product = new Chair();
                break;
            case TABLE:
                product = new Table();
                break;
            case SOFA:
                product = new Sofa();
                break;
        }

        return product;
    }
}
