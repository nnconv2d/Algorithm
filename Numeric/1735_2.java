import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int denominator = b*d;
        int numerator =  a*d + b*c;

        int max = 0; int min = 0;

        if (denominator > numerator) {
            max = denominator;
            min = numerator;
        } else {
            max = numerator;
            min = denominator;
        }

        int remainder = 0;
        int gcd = 1;

        while (true) {
            remainder = max%min;
            if (remainder == 0) {
                gcd = min;
                break;
            } else {
                max = min;
                min = remainder;
            }
        }

        System.out.print(numerator/gcd + " ");
        System.out.println(denominator/gcd);

    }
}
