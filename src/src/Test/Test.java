package Test;
//Dog унаследован от Animal, но метод bark есть только у Dog
public class Test {
    public static void main(String[] args) {
        Dog jack = new Dog();
        jack.eat();
        Animal animal = new Dog(); //полиморфизм, так можно, потому-что Dog содержит все методы Animal
        //Dog lassy = new Animal(); // так нельзя, т.к. у  Dog больше методов чем у Animal
        // animal.bark(); //несмотря на то, что мы создали через Dog,
        // мы имеем только методы, которые Dog наследовал от Animal
        //к методу bark доступа нет
        jack.bark(); // а у собаки есть
        animal.eat();// выводится метод переопределенный в потомке, это позднее связывание

        Animal hangryAnimal = new Animal();
        Cat hangryCat = new Cat();
        Dog hangryDog = new Dog();

        PolimorfizmTest.dinnerTime(hangryAnimal); //благодаря static можем использовать метод не создавая объект
        PolimorfizmTest.dinnerTime(hangryCat);
        PolimorfizmTest.dinnerTime(hangryDog);

        //down cast:
        Animal beast = new Animal();
        Dog wolf = (Dog) beast;
    }
}

class PolimorfizmTest{
    static void dinnerTime(Animal someAnimal){ // принимает класс Animal, но и всех потомков
        someAnimal.eat();
    }
}