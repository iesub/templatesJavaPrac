package mirea.practice.prac6;

import mirea.practice.prac6.Builder.SomeClass;
import mirea.practice.prac6.Prototype.SomeForCloning;
import mirea.practice.prac6.abstractFactory.BlueTrainingGrounds;
import mirea.practice.prac6.abstractFactory.RedTrainingGrounds;
import mirea.practice.prac6.factoryMethod.FurnitureFactory;
import mirea.practice.prac6.factoryMethod.VehicleFactory;

import static mirea.practice.prac6.factoryMethod.Creator.ProductType.PLANE;
import static mirea.practice.prac6.factoryMethod.Creator.ProductType.SOFA;

public class Main {

    public static void main(String[] args) {
        VehicleFactory factory1 = new VehicleFactory();
        factory1.factoryOperation(PLANE);
        FurnitureFactory factory2 = new FurnitureFactory();
        factory2.factoryOperation(SOFA);

        RedTrainingGrounds trainingGround1 = new RedTrainingGrounds();
        trainingGround1.createArcher();
        BlueTrainingGrounds trainingGround2 = new BlueTrainingGrounds();
        trainingGround2.createSwordsman();

        SomeClass obj = new SomeClass.Builder(20).optFieldOne(5).build();
        System.out.println(obj.getOptField());

        SomeForCloning obj1 = new SomeForCloning("Имя");
        System.out.println(obj1.clone().getName());
    }

}
