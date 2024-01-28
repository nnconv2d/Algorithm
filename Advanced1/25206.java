import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        double sum = 0;

        for (int i=0; i<20; i++) {
            st = new StringTokenizer(br.readLine());
            double score = 0;
            st.nextToken();
            st.nextToken();
            String grade = st.nextToken();
            if (grade == "A+") {
                score = 4.5;
            } else if (grade == "A0") {
                score = 4.0;
            } else if (grade == "B+") {
                score = 3.5;
            } else if (grade == "B0") {
                score = 3.0;
            } else if (grade == "C+") {
                score = 2.5;
            } else if (grade == "C0") {
                score = 2.0;
            } else if (grade == "D+") {
                score = 1.5;
            } else if (grade == "D0") {
                score = 1.0;
            } else if (grade == "F") {
                score = 0.0;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
