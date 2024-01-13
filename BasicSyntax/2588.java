import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();

        char[] array = b.toCharArray();

        for (int i=2; i>=0; i--) {
            System.out.println(Character.getNumericValue(array[i]) * a);
        }
        System.out.println(Integer.parseInt(b)*a);
    }
}
