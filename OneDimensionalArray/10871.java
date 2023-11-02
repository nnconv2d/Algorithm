import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>(); // ArrayList 사용
        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        } for (int i=0; i<n; i++) {
            if (a.get(i) < x) { // ArrayList는 대괄호([]) 사용해서 직접 접근 X, .get 메소드 사용해야 함
                System.out.print(a.get(i)+" ");
            }
        }
    }
}
