import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            input();
            for (int j = 0; j < list.size(); j++) {
                if (Collections.frequency(list, list.get(j)) > 1) {
                    boolean tf = isGroup(list, j);
                    if (tf==false) {
                        break;
                    }
                }
                count++;
            }
            System.out.println(count);
        }

        bw.write(Integer.toString(count));

        bw.flush();
        bw.close();
    }
    
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        List<Character> list = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            list.add(ch);
        }
        br.close();
    }

    public static boolean isGroup(List list, int index) {
        int[] idx = new int[Collections.frequency(list, list.get(index))];
        for (int i = 0; i < idx.length - 1; i++) {
            if (idx[i + 1] - idx[i] > 1) {
                return false;
            }
        }
        return true;
    }

}
