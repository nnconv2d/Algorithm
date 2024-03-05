import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int aa = Integer.parseInt(st.nextToken());
        int bb = Integer.parseInt(st.nextToken());

        Long big;
        int small;

        if (aa<=bb) {
            big = Long.valueOf(bb); // Java 9부터 new Long(bb)보다 valueOf 메서드 사용 권장
            small = aa;
        } else {
            big = Long.valueOf(aa);
            small = bb;
        }

        long i = 1;
        while (true) {
            if (big*i % small == 0) {
                bw.write(Long.toString(big*i));
                break;
            }
            i++;
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
