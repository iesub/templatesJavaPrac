package mirea.practice.prac4;

import com.sun.jdi.ThreadReference;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class MyExec{
    int size;
    int used = 0;
    ArrayList<Thread> threads = new ArrayList<>();
    int running = 0;
    MyExec(int size){
        this.size = size;
    }

    class threadRunner extends Thread{
        Thread thisThread;
        @Override
        public void run() {
            while(threads.size() != 0){
                for (int i = 0; i < threads.size(); i++){
                    if (threads.get(i).getState() == State.NEW & used < size){
                        used++;
                        threads.get(i).start();
                    } else if (threads.get(i).getState() == State.TERMINATED){
                        threads.remove(i);
                        used--;
                    }
                }
            }
            running = 0;
        }
    }

    public void execute(Runnable thread){
        threads.add(new Thread(thread));
        if (running == 0){
            running = 1;
            threadRunner runner = new threadRunner();
            runner.start();
        }
    }
}
