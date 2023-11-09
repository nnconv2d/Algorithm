import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();
        for (int i=0; i<9; i++) {
            array.add(sc.nextInt());
        }
        int max = Collections.max(array);
        System.out.println(max);
        System.out.println(array.indexOf(max) + 1);
    }
}
