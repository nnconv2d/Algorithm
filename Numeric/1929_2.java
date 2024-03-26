// 시간 개많이 걸림 ;;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for (int i=m; i<=n; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }

    private static boolean isPrime(int n) {
        if (n==1) return false;
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i==0) return false;
        }
        return true;
    }
}
