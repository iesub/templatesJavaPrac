package mirea.practice.prac8.strategy;

public class Main {
    public static void main(String[] args) {
        ComputerStrategy task = new Game();
        Computer obj = new Computer(task);
        obj.runTask();
    }
}
