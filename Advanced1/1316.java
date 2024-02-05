import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int ans = -1;

        for (int i=1000; i>=0; i--) {
            if (i*5 <= n) {
                for (int j=0; j<1667; j++) {
                    if (i*5 + j*3 == n) {
                        ans = i+j;
                    }
                }
            }
            if (ans != -1) {
                break;
            }
        }

        bw.write(Integer.toString(ans));

        br.close();
        bw.flush();
        bw.close();
    }
}
