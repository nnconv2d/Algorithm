import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        String str = br.readLine();
        char[] chars = new char[str.length()];
        for (int i=0; i<str.length(); i++) {
            chars[i] = str.toCharArray()[i];
        }
        int count = 0;

        for (int i=0; i<chars.length; i++) {


            }

        br.close();
        bw.flush();
        bw.close();
    }
}
