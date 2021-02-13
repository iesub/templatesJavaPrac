package mirea.practice.prac5;

//тут и ленивая реализация и потоко безопасность. разве что synchronized будет на производительность не
//особо положительно влиять, т.к нужен он один раз только

public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton(){}

    public static synchronized SynchronizedSingleton getInstance(){
        if (instance == null){
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
