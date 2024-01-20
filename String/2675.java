import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for (int j=0; j<str.length(); j++) {
                int k=0;
                while (k < num) {
                    bw.write(str.charAt(j)+"");
                    k++;
                }
            }
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
