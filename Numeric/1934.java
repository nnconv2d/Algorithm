import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int big; int small;
            if (a > b) {
                big = a;
                small = b;
            } else {
                big = b;
                small = a;
            }
            int j = 1;
            while (true) {
                if (big*j % small == 0) {
                    System.out.println(big*j);
                    break;
                } else {
                    j++;
                }
            }
        }
    }
}
