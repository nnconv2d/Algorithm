// List로 하면 틀렸습니다 뜨는데 배열로 하면 됨

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] x = new int[3];
        int[] y = new int[3];
        int xx = 0;
        int yy = 0;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        if (x[0] == x[1]) {
            xx = x[2];
        } else if (x[0] == x[2]) {
            xx = x[1];
        } else {
            xx = x[0];
        }

        if (y[0] == y[1]) {
            yy = y[2];
        } else if (y[0] == y[2]) {
            yy = y[1];
        } else {
            yy = y[0];
        }

        bw.write(xx + " " + yy + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
