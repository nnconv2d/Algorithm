import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] stringArray = S.split(" ");
        List<String> stringList = new ArrayList<>(Arrays.asList(stringArray));
        stringList.remove("");
        System.out.println(stringList.size());
    }
}
