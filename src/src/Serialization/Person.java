package Serialization;

import java.io.Serializable;

public class Person implements Serializable { //интерфейс который показывает, что данные объекты можно сериализовывать
    private transient int id; //у чисел будет не null, а значение по умолчанию для примитива, тут 0
    private transient String name; //transient - показывает что поле не будет записываться в бинарь -
    // при чтении будет null вместо значения поля

   private static final long serialVersionUID = -1234567L;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return id + " : " + name;
    }
}
