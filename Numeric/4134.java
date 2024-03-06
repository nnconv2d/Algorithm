import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            long num = Long.parseLong(br.readLine());
            if (isPrime(num)) {
            } else {
                while (!isPrime(num)) {
                    num++;
                }
            }
            bw.write(String.valueOf(num));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(long num) {
        if (num<2) {
            return false;
        }
        if (num==2) {
            return true;
        }
        for (long i=2; i<Math.sqrt(num)+1; i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
}
