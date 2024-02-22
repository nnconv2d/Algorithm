// Arrays.sort(have)를 BinarySearch 안에 넣으면 시간 초과 뜸

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] have = new int[n]; // 상근이가 가지고 있는 카드
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            have[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i=0; i<m; i++) {
            if (binarySearch(have, Integer.parseInt(st.nextToken()))) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean binarySearch(int[] list, int num) {
        Arrays.sort(list);
        int n = list.length;
        int l = 0;
        int h = n-1;

        while (l<=h) {
            int mid = (l+h)/2;
            if (num < list[mid]) {
                h = mid-1;
            } else if (num > list[mid]) {
                l = mid+1;
            } else {
                return true;
            }
        }
        return false;
    }
}
