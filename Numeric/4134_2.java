import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i=0; i<t; i++) {
            long n = Integer.parseInt(br.readLine());
            System.out.println(findPrime(n));
        }

        br.close();
    }

    private static long findPrime(long n) {
        if (n==0 || n==1) {
            return 2;
        }
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i == 0) {
                n++;
            }
        }
        return n;
    }
}
