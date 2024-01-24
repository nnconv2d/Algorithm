import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Integer.parseInt(br.readLine());
        long result = n*n*n;
        bw.write(result+"");
        bw.newLine();
        bw.write("3");

        br.close();
        bw.flush();
        bw.close();
    }
}
