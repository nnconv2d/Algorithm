import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Integer.parseInt(br.readLine());
        long result = (n*(n-1))/2;
        bw.write(result+"");
        bw.newLine();
        bw.write("2");

        br.close();
        bw.flush();
        bw.close();
    }
}
