public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while(true){
            i++;
            if(i==15){
                break; // прервать цикл
            }else if(i==10){
                continue; //прервать текущую итерацию и перейти на следующую
            }
            System.out.println(i);


        }
    }
}
