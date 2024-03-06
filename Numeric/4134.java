import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int num = 0;

        for (int i=0; i<n; i++) {
            num = Integer.parseInt(br.readLine());
                for (int j=2; i<=num/2+1; i++) {
                    if (i<num/2+1 && num/i!=0) {
                        num++;
                    } else if (i==num/2+1 && num%i!=0) {
                        bw.write(Integer.toString(num));
                    } else if (i)
                }
            }

        br.close();
        bw.flush();
        bw.close();
    }
}
