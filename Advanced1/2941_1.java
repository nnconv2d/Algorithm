import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        char[] chars = new char[str.length()];
        for (int i=0; i<str.length(); i++) {
            chars[i] = str.toCharArray()[i];
        }
        int count = 0;

        for (int i=0; i<chars.length; i++) {
            String ch = Character.toString(chars[i]);
            if (i + 1 < chars.length) {
                String ch1 = Character.toString(chars[i + 1]);
                if (ch.equals("c") && (ch1.equals("=") || ch1.equals("-"))) {
                    count++;
                    i++;
                } else if (ch.equals("d") && ch1.equals("-")) {
                    count++;
                    i++;
                } else if (i+2 < chars.length && ch.equals("d") && ch1.equals("z") && Character.toString(chars[i+2]).equals("=")) {
                    count++;
                    i += 2;
                } else if (ch.equals("l") && ch1.equals("j")) {
                    count++;
                    i++;
                } else if (ch.equals("n") && ch1.equals("j")) {
                    count++;
                    i++;
                } else if ((ch.equals("s") || ch.equals("z")) && (ch1.equals("="))) {
                    count++;
                    i++;
                } else {
                    count++;
                }
            } else if (i+1 == chars.length){
                count++;
            }
        }

        bw.write(Integer.toString(count));

        br.close();
        bw.flush();
        bw.close();
    }
}
