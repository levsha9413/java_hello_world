/*
Примитивные типы данных
 */


public class Variables {
    public static void main(String[] args){

        byte myByte = (byte) 100; // 2^8=256 от -128 до 127
        short myShort = 32666; //2^(16-1)= нижняя граница, от -32768 до 32767
        int myInt; //декларация, -2^(32-1) до (2^32-1) - 1
        myInt = 128; //инициализация
        long myLong = 12L; //-2^(64-1) до (2^64-1)-1

        float myFloat = 4.04f; //32 бит
        double myDouble = 4.04; //64 бит


        char myChar = 's';
        boolean myBoolean = true;

        //приведение типов
        int intValue = 128;
        byte value = (byte)intValue;
        System.out.println(value); // -128, т.к. произошло сужающее приобразование типов, 128 не влез в тип byte




    }
}

