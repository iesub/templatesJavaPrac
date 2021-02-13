package mirea.practice.prac6.factoryMethod;

public class VehicleFactory extends Creator{
    @Override
    protected Product factoryMethod(ProductType type) {
        Product product = null;

        switch(type){
            case CAR:
                product = new Car();
                break;
            case PLANE:
                product = new Plane();
                break;
        }

        return product;
    }
}
