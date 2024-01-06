import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrixA = new int[n][m];
        int[][] matrixB = new int[n][m];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j < m; j++) {
                if (j!=m-1) {
                    System.out.print((matrixA[i][j] + matrixB[i][j])+" ");
                } else {
                    System.out.println(matrixA[i][j] + matrixB[i][j]);
                }
            }
        }
    }
}
