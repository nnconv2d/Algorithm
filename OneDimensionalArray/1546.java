import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        double[] arr = new double[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        double max = arr[n-1];
        double avg = 0.0;

        for (int i=0; i<n; i++) {
            arr[i] = (arr[i]/max)*100;
            avg += arr[i];
        }

        bw.write(Double.toString(avg/n));

        br.close();
        bw.flush();
        bw.close();
    }
}
