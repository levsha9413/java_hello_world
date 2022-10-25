public class Multidimentionals_arrays {
    public static void main(String[] args) {
        //двумерный массив - матрица
        int[][] array = new int[10][10];
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}}; //[3][3] - [row][column]
        System.out.println(matrix[0][2]);//3
        //каждая строка может иметь свою размерность
        int[][]matrix1 = {{1},
                          {2,3},
                          {4,5,6,7,8}};
        matrix1[0][0]=10;
        System.out.println(matrix1[0][0]); //10

        //для вывода двумерных массивов используются вложенные циклы
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");  //print выводит в строку
            }
            System.out.print("\n"); //для переноса на новую строку можно также println
        }

    }
}
