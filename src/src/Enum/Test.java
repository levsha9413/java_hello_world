package Enum;

public class Test {
    /*рефлизация до Enum
    private static final int DOG = 0;
    private static final int CAT = 1;

    public static void main(String[] args) {
        int animal = DOG; //проблема в том, что можно передать любое число, не относящееся к Animal
        switch (animal){
            case DOG:
                System.out.println("Dog");
                break;
            case CAT:
                System.out.println("Cat");
                break;
        }
        //c Enum

     */

    public static void main(String[] args) {


        Animal animalX = Animal.CAT; //гарантировано кладем кого-то из животных
        switch (animalX){
            case CAT:
                System.out.println("Its a cat");
                break;
            case DOG:
                System.out.println("Its a dog");
                break;

        }
        System.out.println(animalX instanceof Enum); //true, для всех родителей
        System.out.println(animalX.getClass()); //class Enum.Animal

        Season summer = Season.SUMMER;
        System.out.println(summer.getTranslition());
        System.out.println(summer.toString());

        //методы из класса enum
        System.out.println(summer.name()); //SUMMER
        Season summer2 = Season.valueOf("SUMMER"); //вернет объект summer
        System.out.println(summer2.getTranslition()); //лето
        System.out.println(summer.ordinal()); //возвращает индекс элемента внутри Seasons

    }
}
