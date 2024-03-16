import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numerator1 = Integer.parseInt(st.nextToken());
        int denominator1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int numerator2 = Integer.parseInt(st.nextToken());
        int denominator2 = Integer.parseInt(st.nextToken());
        br.close();

        int a = numerator1 * denominator2 + numerator2 * denominator1;
        int b = denominator1 * denominator2;

        for (int i=a; i>=1; i--) {
            if (a%i == 0 && b%i == 0) {
                System.out.print(a/i + " ");
                System.out.println(b/i);
                break;
            }
        }
    }
}
