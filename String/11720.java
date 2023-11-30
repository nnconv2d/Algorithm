import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String n = sc.next();
        char[] numList = n.toCharArray();
        int sum = 0;
        for (int i=0; i<num; i++) {
            sum += Character.getNumericValue(numList[i]);
        }
        System.out.println(sum);
    }
}
