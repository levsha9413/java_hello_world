public class Static {
    public static void main(String[] args) {

        Piple man = new Piple(25, "Zhora");
        Piple.setDescription("Ратататата"); // изменили статический атрибут у класса ->  у всех объектов
        System.out.println(man.description);
        System.out.println(man.getCounter());
    }
}

class Piple{
    private int age; //переменные, привязанные к объекту
    private String name;
    public static String description = "Description"; //static - переменная привязанная к классу, одна на все объекты
    private static int counter;
    Piple(int age, String name){
        this.age = age;
        this.name = name;
        counter++;
    }

    public static void setDescription(String thisDescription){
        description = thisDescription;
    }
    public int getCounter(){  //будет показывать одно число при вызове у любого объекта
        return counter;
    }

}
//статические методы и атрибуты существуют сразу при запуске программы, а обычные методы и атрибуты создаются при создании объекта
//поэтому статический метод не может работать с обычными полями
//статический метод - метод который можно использовать без создания экземпляра класса
//наподобии функций, например Math.pow()
//статическая переменная Math.PI
//еще одно применение статических переменных - это сбор какой-то мета информации о классе
//например количество созданных объектов у этого класса см.counter