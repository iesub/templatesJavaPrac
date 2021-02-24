package mirea.practice.prac8.command;

interface Command{
    void execute();
}

class Light{
    public Light(){  }

    public void turnOn(){
        System.out.println("Свет включен");
    }

    public void turnOff(){
        System.out.println("Свет выключен");
    }
}

class TurnOnLightCommand implements Command{
    private Light theLight;

    public TurnOnLightCommand(Light light){
        this.theLight=light;
    }

    public void execute(){
        theLight.turnOn();
    }
}

class TurnOffLightCommand implements Command{
    private Light theLight;

    public TurnOffLightCommand(Light light){
        this.theLight=light;
    }

    public void execute(){
        theLight.turnOff();
    }
}

class Switch {
    private Command flipUpCommand;
    private Command flipDownCommand;

    public Switch(Command flipUpCommand,Command flipDownCommand){
        this.flipUpCommand=flipUpCommand;
        this.flipDownCommand=flipDownCommand;
    }

    public void flipUp(){
        flipUpCommand.execute();
    }

    public void flipDown(){
        flipDownCommand.execute();
    }
}