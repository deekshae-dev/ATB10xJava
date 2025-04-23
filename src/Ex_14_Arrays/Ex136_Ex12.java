package Ex_14_Arrays;

public class Ex136_Ex12 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};

        //3*3
        //R-3
        //C-3
        //1,2,3
        //4,5,6
        //7,8,9

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "|");
                //System.out.println("*");
            }
            System.out.println();
        }
    }
}
