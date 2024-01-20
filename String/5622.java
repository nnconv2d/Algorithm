import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();
        int time = 0;

        for (int i=0; i<arr.length; i++) {
            char dial = arr[i];
            if (dial=='A' || dial=='B' || dial=='C') {
                time += 3;
            } else if (dial=='D' || dial=='E' || dial=='F') {
                time += 4;
            } else if (dial=='G' || dial=='H' || dial=='I') {
                time += 5;
            } else if (dial=='J' || dial=='K' || dial=='L') {
                time += 6;
            } else if (dial=='M' || dial=='N' || dial=='O') {
                time += 7;
            } else if (dial=='P' || dial=='Q' || dial=='R' || dial=='S') {
                time += 8;
            } else if (dial=='T' || dial=='U' || dial=='V') {
                time += 9;
            } else {
                time += 10;
            }
        }
        bw.write(time+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
