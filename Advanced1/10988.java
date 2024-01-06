import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        char[] wordList = word.toCharArray();
        int length = word.length();

        for (int i=0; i<length; i++) {
            if (wordList[i] != wordList[length -1 -i]) {
                bw.write("0");
                break;
            } else if (i==length-1 && wordList[length-1] == wordList[0]) {
                bw.write("1");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
