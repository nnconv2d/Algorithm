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
        if (getLeastCommonMultiple(a, b) == a*b) {
            System.out.print(a + " ");
            System.out.println(b);
        } else {
            int num = a*b/getLeastCommonMultiple(a, b);
            System.out.println(a/num + " ");
            System.out.println(b/num);
        }
    }

    private static int getLeastCommonMultiple(int a, int b) {
        int i = 1;
        int big = Math.max(a, b);
        int small = Math.min(a, b);
        while (true) {
            if (big*i % small == 0) {
                return big*i;
            } else {
                i++;
            }
        }
    }
}
