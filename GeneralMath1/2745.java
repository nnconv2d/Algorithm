import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] array = (sc.next()).toCharArray();
        int b = sc.nextInt();
        int result = 0;
        int n = array.length;

        for (int i=n-1; i>=0; i--) {
            int num = Character.getNumericValue(array[i]);
            int j = (n-1)-i;
            result += (Math.pow(b, j)) * num;
        }
        System.out.println(result);
    }
}
