package mirea.practice.prac3;

import java.util.*;

//имплементация писать как: весь класс переписывать или просто написать функцию небольшую?

public class Main {

    static volatile List list = new MyList<Integer>();

    static volatile Set set = new HashSet<Integer>();

    synchronized static void addToSet(int value){
        set.add(value);
    }

    public static void main(String[] args) {

        Thread one = new Thread(()->{System.out.println("Поток 1 начал работу"); for (int i = 0; i < 5000; i++){list.add(i);}System.out.println("Поток 1 закончил работу");});
        Thread two = new Thread(()->{System.out.println("Поток 2 начал работу"); for (int i = 0; i < 5000; i++){list.add(i);}System.out.println("Поток 2 закончил работу");});

        try {
            one.start();
            two.start();
            Thread.sleep(1000);
            System.out.println(list.size());
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        Thread three = new Thread(()->{System.out.println("Поток 3 начал работу"); for (int i = 0; i < 5000; i++){addToSet(i);}System.out.println("Поток 3 закончил работу");});
        Thread four = new Thread(()->{System.out.println("Поток 4 начал работу"); for (int i = 5000; i < 10000; i++){addToSet(i);}System.out.println("Поток 4 закончил работу");});

        try {
            three.start();
            four.start();
            Thread.sleep(1000);
            System.out.println(set.size());
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
