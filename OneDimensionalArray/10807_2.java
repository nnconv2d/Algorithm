// ArrayList와 두 가지 loop 선언 후 첫 번째 루프에서 입력을 받고 두 번째 루프에서 v값과 리스트의 값을 비교한 방법

import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        ArrayList<Integer> ints = new ArrayList<>();

        for (int i=0; i<n; i++) {
            ints.add(sc.nextInt());
        }

        int v = sc.nextInt();

        for (int i=0; i<n; i++) {
            if (ints.get(i) == v) {
                count++;
            }
        }
        System.out.println(count);
    }
}
