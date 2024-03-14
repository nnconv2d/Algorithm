import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i=0; i<t; i++) {
            long n = Long.parseLong(br.readLine());
            System.out.println(findPrime(n));
        }

        br.close();
    }

    private static long findPrime(long n) {
        while (true) {
            if (isPrime(n)) {
                return n;
            } else {
                n++;
            }
        }
    }

    private static boolean isPrime(long n) {
        if (n<=1) return false;
        else {
            for (int i=2; i<=Math.sqrt(n); i++) {
                if (n%i == 0) return false;
            }
            return true;
        }
    }
}
