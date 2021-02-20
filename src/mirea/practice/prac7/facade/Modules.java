package mirea.practice.prac7.facade;

class Name{
    String name = "Имя";

    public void getName() {
        System.out.println(name);
    }
}

class Password{
    String pass = "Пароль";

    public void getPass() {
        System.out.println(pass);
    }
}

class Mail{
    String mail = "mail@example.ru";

    public void getMail() {
        System.out.println(mail);
    }
}

class MainInf{
    Name name;
    Password pass;
    Mail mail;

    MainInf(Name name, Password pass, Mail mail){
        this.name = name;
        this.pass = pass;
        this.mail = mail;
    }

    public void getInf(){
        name.getName();
        pass.getPass();
        mail.getMail();
    }
}