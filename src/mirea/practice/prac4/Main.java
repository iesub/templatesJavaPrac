package mirea.practice.prac4;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyExec exec = new MyExec(2);
        Runnable threadOne = () -> {
            try {
                for(int i = 0; i < 5; i++) {
                    System.out.println("Поток 1 - " + i);
                    Thread.sleep((long)(Math.random()*1500));
                }
                System.out.println("Поток 1 -  completed");
            } catch (InterruptedException e) {}
        };

        Runnable threadTwo = () -> {
            try {
                for(int i = 0; i < 5; i++) {
                    System.out.println("Поток 2 - " + i);
                    Thread.sleep((long)(Math.random()*1500));
                }
                System.out.println("Поток 2 -  completed");
            } catch (InterruptedException e) {}
        };

        Runnable threadThree = () -> {
            try {
                for(int i = 0; i < 5; i++) {
                    System.out.println("Поток 3 - " + i);
                    Thread.sleep((long)(Math.random()*1500));
                }
                System.out.println("Поток 3 -  completed");
            } catch (InterruptedException e) {}
        };

        exec.execute(threadOne);
        exec.execute(threadTwo);
        exec.execute(threadThree);
    }

}
