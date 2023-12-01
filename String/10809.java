import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i: alphabets) {
            System.out.print(S.indexOf(i) + " ");
        }
    }
}
