// 기본 알고리즘은 다 너무너무 잘 생각했는데 필요없는 배열, 변수들 때문에 계속 시간 초과 나던 문제
// 없어도 되는 배열은 만들지 말기! 웬만하면 일회용 변수 선에서 처리

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] tree = new int[n];
        for (int i=0; i<n; i++) {
            tree[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        int gcd = tree[n-1] - tree[n-2];
        for (int i=0; i<n-1; i++) {
            int d = tree[i+1] - tree[i];
            gcd = getGcd(d, gcd);
        }

        bw.write(Integer.toString((tree[tree.length-1] - tree[0])/gcd +1 - tree.length));

        bw.flush();
        bw.close();

    }

    private static int getGcd(int a, int b) {
        while (b != 0) {
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
