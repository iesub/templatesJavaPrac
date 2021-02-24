package mirea.practice.prac8.strategy;

interface ComputerStrategy{
    public void execute();
}

class Computer {
    private ComputerStrategy strategy;

    public Computer(ComputerStrategy strategy){
        this.strategy = strategy;
    }

    public void setNewTask(ComputerStrategy strategy){
        this.strategy = strategy;
    }

    public void runTask() {
        this.strategy.execute();
    }
}

class Game implements ComputerStrategy {
    @Override
    public void execute() {
        System.out.println("Играем");
    }
}

class Music implements ComputerStrategy {
    @Override
    public void execute() {
        System.out.println("Слушаем музыку");
    }
}