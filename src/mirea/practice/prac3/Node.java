package mirea.practice.prac3;

public class Node<T> {

    private Node next;
    private Node previous;
    private T value;

    public Node() {
        this.next = null;
        this.previous = null;
    }

    public Node(Node previous) {
        this.next = null;
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public T getT() {
        return value;
    }

    public void setT(T value) {
        this.value = value;
    }
}
