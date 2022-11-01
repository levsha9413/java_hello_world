package Equals;
//сравнение объектов
public class Equals {
    public static void main(String[] args) {
        Animal animal1 = new Animal(21);
        Animal animal2 = new Animal(21);
        System.out.println(animal1==animal2); //такое сравнение не работает для сложных объектов,
        // потому что объекты хранятся в разных участках памяти
        animal2.equals(animal1); //метод объекта Object
        System.out.println(animal1.equals(animal2));
    }
}

class Animal{
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    Animal(int id){
        this.setId(id);
    }

    public boolean equals(Object object){ //переопределяем метод
        Animal animal = (Animal) object;//применяем даункаст, т.к. сигнатура метода должна соответствовать методу родителя
        if(this.id==animal.id){
            return true;
        }else{
            return false;
        }
        //return this.id==animal.id - более короткий вариант
    }
}