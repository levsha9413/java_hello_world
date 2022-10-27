//Обертки примитивных типов
//Обертки примитивных типов, это классы, у которых есть методы для работы с примитивами
//Double, Float, Long, Integer, Short, Byte, Character, Boolean
public class Wrappers {
    public static void main(String[] args) {
        int x = 1;
        //Integer xx = new Integer(22);  //специфичный пример
        Integer xx = 22; //упаковка - процесс аналогичный примеру выше
        int z = xx; //распаковка обертки
        //если нужно просто число - используйте примитивы
        //если нужен метод для работы с числом - используйте классы обертки
        int y = Integer.getInteger("22"); //статичный метод перевода строки к числу
    }
}
