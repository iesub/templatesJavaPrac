package mirea.practice.prac7.compan;

import java.util.LinkedList;
import java.util.List;

interface Component{
    public void add(Component c);
    public void remove(Component c);
    public void draw();
}

class Circle implements Component{

    @Override
    public void add(Component c) {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }

    @Override
    public void remove(Component c) {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }

}

class Line implements Component{

    @Override
    public void add(Component c) {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }

    @Override
    public void remove(Component c) {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }

    @Override
    public void draw() {
        System.out.println("Рисуем линию");
    }

}

class GroupComponent implements Component{

    private List<Component> list;

    public GroupComponent(Component...components)
    {
        list = new LinkedList<>();
        for(Component c: components)
            list.add(c);
    }

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public void draw() {
        for (int i = 0; i < list.size(); i++){
            list.get(i).draw();
        }
    }

}


