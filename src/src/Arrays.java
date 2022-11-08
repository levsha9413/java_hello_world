public class Arrays {
    public static void main(String[] args) {
        int number = 10;
        char box = 'a'; //примитивные типы данных
        String myString = "Сам объект, на который ссылается переменная myString"; //ссылочный тип данных

        int[] numbers = new int[5]; //создали массив с 5 ячейками, по умолчанию в них лежат нули
        System.out.println(numbers[0]); //вывести первую ячейку массива -> 0

        //для инициализации всех ячеек масссива удобнои использовать цикл for
         for(int i=0; i<numbers.length; i++){  //.lenght - длинна массива
             numbers[i]=i;
             System.out.println("numbers[]:" + numbers[i]);

        }

         int[] numbers1 = {1,2,3,4,5}; //второй способ инициализации массива
         for(int i=0; i<numbers1.length; i++){
             System.out.println("numbers1[" + i +"] = " + numbers1[i]);
         }
    }
}
//System.out.println(Arrays.toString(arrayDigits)); //[1, 2, 3, 4, 5] - полезный метод для вывода массива
//тут не работает, потому-что переопределили класс Array
