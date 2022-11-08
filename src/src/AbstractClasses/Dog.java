package AbstractClasses;

public class Dog extends Animal{
    @Override
    protected void makeSound() {
        System.out.println("BARKBARKBARKBARK");
    }

    @Override
    protected void eat() {
        System.out.println("sss");
    }
}
