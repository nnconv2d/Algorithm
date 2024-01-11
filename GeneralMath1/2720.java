// double형을 사용해서 소수를 많이 사용하면 부동 소수점 연산에서 오차가 발생하여 값이 다르게 나옴 -> 웬만하면 정수로

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0; i<t; i++) {
            int money = sc.nextInt();
            int q = money/25;
            money %= 25;
            int d = money/10;
            money %= 10;
            int n = money/5;
            money %= 5;
            int p = money;
            System.out.println(q + " " + d + " " + n + " " + p);
        }
    }
}
