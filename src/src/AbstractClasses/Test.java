package AbstractClasses;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
       // Animal animal = new Animal(); Animal абстрактный класс, нельзя создать объект
        dog.eat();
        dog.makeSound();
        cat.makeSound();
    }
}
