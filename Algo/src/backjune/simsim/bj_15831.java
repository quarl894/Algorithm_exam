package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_15831 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split(" ");
        int N = Integer.parseInt(sp[0]);
        int B = Integer.parseInt(sp[1]);
        int W = Integer.parseInt(sp[2]);
        int count_B = 0, count_W = 0;
        int len = 0;
        int result = 0;
        int end = 0;

        char[] ch = br.readLine().toCharArray();
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (ch[j] == 'W') count_W++;
                else if (ch[j] == 'B') count_B++;
                if (count_B > B) {
                    count_B--;
                    end = j - 1;
                    break;
                } else {
                    end = j;
                }
            }
            if (count_B <= B && count_W >= W) {
                len = end - i + 1;
                if (result < len) result = len;
                // System.out.println("W: " + count_W + "B: " +count_B + "len: " + i);
            }
            count_B = 0;
            count_W = 0;
            end = 0;
            len = 0;
        }
        br.close();
        System.out.println(result);
    }
}
