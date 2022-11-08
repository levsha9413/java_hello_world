public class For_Each_loop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] strings = new String[3]; //3 strings in this array
        strings[0] = "Hello";
        strings[1] = "World";
        System.out.println(strings[0]);

        //for each - цикл для обработки структур данных
        for(String string:strings){ // Тип данных, переменная в которую кладется один элемент структуры, структура
            System.out.println(string);
        }

        int[] numbers0 = {1,2,3,4,5,6,7,8,9};
        int summ = 0;
        for(int x:numbers0){
            summ = summ + x;
        }
        System.out.println("summ = " + summ);

        int a = 0; // выделили 32 бита
        String f; // ссылка указывающая на null, неизвестно сколько памяти нужно выделить под строку
        f = "Конкретный объект в памяти"; //теперь ссылка указывает на объект
    }
}
