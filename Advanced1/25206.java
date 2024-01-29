import java.io.*;
import java.math.BigDecimal;
import java.util.StringTokenizer;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        BigDecimal sum = new BigDecimal("0.0");
        BigDecimal numSum = new BigDecimal("0");

        for (int i=0; i<20; i++) {
            st = new StringTokenizer(br.readLine());
            BigDecimal score = new BigDecimal("0.0");
            st.nextToken();
            BigDecimal num = new BigDecimal(st.nextToken());
            String grade = st.nextToken();
            if (grade.equals("A+")) {
                score = new BigDecimal("4.5");
            } else if (grade.equals("A0")) {
                score = new BigDecimal("4.0");
            } else if (grade.equals("B+")) {
                score = new BigDecimal("3.5");
            } else if (grade.equals("B0")) {
                score = new BigDecimal("3.0");
            } else if (grade.equals("C+")) {
                score = new BigDecimal("2.5");
            } else if (grade.equals("C0")) {
                score = new BigDecimal("2.0");
            } else if (grade.equals("D+")) {
                score = new BigDecimal("1.5");
            } else if (grade.equals("D0")) {
                score = new BigDecimal("1.0");
            } else if (grade.equals("F")) {
                score = new BigDecimal("0.0");
            }

            if (!grade.equals("P")) {
                sum = sum.add(score.multiply(num));
                numSum = numSum.add(num);
            }
        }

        System.out.println(sum.divide(numSum, 6, BigDecimal.ROUND_HALF_UP));

        br.close();
        bw.flush();
        bw.close();
    }
}
