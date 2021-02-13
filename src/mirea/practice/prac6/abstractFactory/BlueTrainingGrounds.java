package mirea.practice.prac6.abstractFactory;

public class BlueTrainingGrounds implements TrainingGrounds{
    public Swordsman createSwordsman(){
        return new BlueForceSwordsmen();
    }

    public Archer createArcher(){
        return new BlueForceArcher();
    }
}
