package mirea.practice.prac6.Prototype;

public class SomeForCloning implements Prototype{
    private String name;

    public SomeForCloning(String name){
        this.name = name;
    }

    public SomeForCloning clone(){
        return this;
    }

    public String getName() {
        return name;
    }
}
