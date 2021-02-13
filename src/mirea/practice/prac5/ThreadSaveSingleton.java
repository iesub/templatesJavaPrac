package mirea.practice.prac5;

//тут уже не страшны потоки, однако объект сразу инициализирован и в таком случае нельзя обработать
//исключительные ситуации

public class ThreadSaveSingleton {
    private static ThreadSaveSingleton instance = new ThreadSaveSingleton();

    private ThreadSaveSingleton(){}

    public static ThreadSaveSingleton getInstance(){
        return instance;
    }
}
