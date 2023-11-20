import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<String> stringList = new ArrayList<>();
        for (int i=0; i<t; i++) {
            String word = sc.nextLine();
            char a = word.charAt(0);
            char b = word.charAt(word.length()-1);
            StringBuilder sb = new StringBuilder();
            sb.append(a).append(b);
            stringList.add(sb.toString());
        }
        for (String i: stringList){
            System.out.println(i);
        }
    }
}
