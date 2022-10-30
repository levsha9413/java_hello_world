package AbstractClasses;

public abstract class Animal {
    protected void eat(){
        System.out.println("I eat...");
    }
    protected abstract void makeSound(); //абстрактный метод, т.к. мы знаем что у наследников будет разная реализация,
    // незачем ее здесь прописывать
}
