import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] original = {1, 1, 2, 2, 2, 8};
        int[] input2 = new int[6];
        for (int i=0; i<input2.length; i++) {
            input2[i] = sc.nextInt();
            original[i] = original[i] - input2[i];
            System.out.print(Integer.toString(original[i]) + ' ');
        }
    }
}
