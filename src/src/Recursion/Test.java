package Recursion;

public class Test
{
    public static void main(String[] args) {
        counter(3); //

        //4! = 4 * 3 * 2 * 1
        //0! = 1
        System.out.println(factorial(0));
    }
    static void counter(int n){
            if(n==0){     //обязательно должно быть условие выхода из рекурсии,
                // иначе программа выжрет все ресурсы и упадет с ошибкой
                return;
            }
        System.out.println(n);
        counter(n-1);
    }

    static int factorial(int n){
        if (n == 1){
            return n;
        } else if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
