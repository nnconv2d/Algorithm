import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[9][9];
        int max = 0;
        int row = 0;
        int column = 0;

        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] >= max) {
                    max = matrix[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(max);
        System.out.print((row+1) + " " + (column+1));
    }
}
