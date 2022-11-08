package Generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        Dog jack = new Dog(223);
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(332));
        dogs.add(new Dog(334));
        dogs.add(new Dog(335));

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(772));
        animals.add(new Animal(773));
        animals.add(new Animal(774));

        PrintListByWildcards.GrandMasterPrintedList(animals);
        PrintListByWildcards.GrandMasterPrintedList(dogs);


    }
}

class PrintListByWildcards{
    public static void GrandMasterPrintedList(List<? extends Animal> animals){ //используем wildcards чтобы метод работал с листами разных типов
        for (Animal animal:animals) {
            animal.getId();
        }
    }
}
