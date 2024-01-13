import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int hour = a + (b+c)/60;
        int minute = (b+c)%60;

        if (hour >= 24) {
            System.out.println(hour-24 + " " + minute);
        } else {
            System.out.println(hour + " " + minute);
        }
    }
}
