package mirea.practice.prac6.abstractFactory;

public class RedTrainingGrounds implements TrainingGrounds{
    @Override
    public Archer createArcher() {
        return new RedForceArcher();
    }

    @Override
    public Swordsman createSwordsman() {
        return new RedForceSwordsman();
    }
}
