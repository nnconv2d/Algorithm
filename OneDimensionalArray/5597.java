import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        for (int i=1; i<=28; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }
        for (int i=1; i<=30; i++) {
            if (numbers.contains(i) == false) {
                System.out.println(i);
            }
        }
    }
}
