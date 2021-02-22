package mirea.practice.prac3;

import java.util.*;

public class MySet<E> implements Set<E> {

    private HashMap<E,Object> map;

    private static final Object PRESENT = new Object();

    public MySet() {
        map = new HashMap<>();
    }

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    public int size() {
        return map.size();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    public boolean add(E o) {
        {
            return map.put(o, PRESENT)==null;
        }
    }

    public synchronized boolean remove(Object o) {
        return map.remove(o)==PRESENT;
    }

    public synchronized void clear() {
        map.clear();
    }

    @Override
    public Object[] toArray() {
        Object[] a = new  Object[1];
        return a;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return a;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }
}
