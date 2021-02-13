package mirea.practice.prac5;

//самая простая реализация, но решение не будет работать в многопоточной среде
//+ в том, что экземпляр будет инициализирован только когда он нужен

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
