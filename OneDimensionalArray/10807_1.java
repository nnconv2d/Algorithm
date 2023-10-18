// array 선언 후 차례대로 입력을 받아 사용한 방법

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int sum = 0;

        for (int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        for (int i=0; i<n; i++) {
            if (array[i] == v) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
