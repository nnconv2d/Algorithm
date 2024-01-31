import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int count = 0;

        for (int j=0; j<n; j++) {
            count = 0;
            char[] num = (Integer.toString(j)).toCharArray();
            for (int i=0; i<num.length; i++) {
                count += Character.getNumericValue(num[i]);
            }
            if (j+count == n) {
                list.add(j);
            }
        }

        if (list.isEmpty() == true) {
            bw.write("0");
        } else {
            bw.write(list.get(0)+"");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
