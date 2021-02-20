package mirea.practice.prac7.compan;

public class Main {
    public static void main(String[] args) {
        Component group;
        Component circle = new Circle();
        Component line = new Line();
        group = new GroupComponent(circle, line);
        group.draw();
    }
}
