// 628 ms

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            for (int j=n-i; j>0; j--) {
                System.out.print(' ');
            }
            for (int k=1; k<=2*i-1; k++) {
                System.out.print('*');
            }
            System.out.println(' ');
        }
        for (int i=n-1; i>=1; i--) {
            for (int j=n-i; j>0; j--) {
                System.out.print(' ');
            }
            for (int k=1; k<=2*i-1; k++) {
                System.out.print('*');
            }
            if (i!=1) {
                System.out.println(' ');
            }
        }
    }
}
