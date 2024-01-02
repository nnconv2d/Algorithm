import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char[] aList = a.toCharArray();
        char[] bList = b.toCharArray();
        char[] aListUpdated = new char[3];
        char[] bListUpdated = new char[3];
        for (int i=0; i<3; i++) {
            aListUpdated[i] = aList[2-i];
            bListUpdated[i] = bList[2-i];
        }
        String aString = new String(aListUpdated);
        String bString = new String(bListUpdated);
        int aInt = Integer.parseInt(aString);
        int bInt = Integer.parseInt(bString);
        if (aInt > bInt) {
            System.out.println(aInt);
        } else {
            System.out.println(bInt);
        }
    }
}
