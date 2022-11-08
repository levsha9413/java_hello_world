public class If {
    public static void main(String[] args) {
        int myInt = 12;

        if(myInt==6){
            System.out.println("Выполнилось условие 1");
        }else if (myInt>12){
            System.out.println("Выполнилось условие 2");
        }else{
            System.out.println("Если не выполнились предыдущие условия");
        }
    }
}
