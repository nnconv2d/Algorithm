import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            List<Character> list = makeList(br);
            boolean tf = isGroup(list, i);
            if (!tf) {
                break;
            } else {
                count++;
            }
            System.out.println(count);
        }

        bw.write(Integer.toString(count));

        br.close();
        bw.flush();
        bw.close();
    }

    public static List<Character> makeList(BufferedReader br) throws IOException {
        String str = br.readLine();
        List<Character> list = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            list.add(ch);
        }
        return list;
    }

    /**
     * list의 index번째 알파벳이 list에 몇 번 들어있는지를 체크한 후
     * 그 값이 2 이상일 경우 list에서의 알파벳 인덱스 리턴
     * 이웃하는 인덱스의 차가 2 이상일 경우 false 리턴
     */
    public static boolean isGroup(List list, int index) {
        if (Collections.frequency(list, list.get(index)) > 1) {
            int[] idx = new int[Collections.frequency(list, list.get(index))];
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(list.get(index))) {
                    list.add(list.indexOf(list.get(index)));
                }
            }
            for (int i = 0; i < idx.length - 1; i++) {
                if (idx[i + 1] - idx[i] > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
