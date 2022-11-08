package Intarfaces;

public class Animal implements Info {  //обязан реализовывать методы интерфейса инфо
    public int id;
    public void sleep(){
        System.out.println("I sleeping");
    }

    public Animal(int id) {
        this.id = id;
    }

    public void showInfo() {
        System.out.println(this.id);
    }
}
