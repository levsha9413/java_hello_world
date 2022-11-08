package Intarfaces;

public class Person implements Info {
    public int age;
    public String name;
    public void hello(){
        System.out.println("Hello");
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println(this.name);
    }
}
