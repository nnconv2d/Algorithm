import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] array = new int[t];
        for (int i=0; i<t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            array[i] = a+b;
        }
        for (int i=0; i<t; i++) {
            System.out.println(array[i]);
        }
    }
}
