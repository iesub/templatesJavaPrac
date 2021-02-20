package mirea.practice.prac7.facade;

public class Main {
    public static void main(String[] args) {
        Name name = new Name();
        Password pass = new Password();
        Mail mail = new Mail();

        MainInf inf = new MainInf(name, pass, mail);

        inf.getInf();
    }
}
