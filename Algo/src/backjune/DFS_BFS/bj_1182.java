package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1182 {
    static int N;
    static int S;
    static int cnt = 0;
    static int[] numArr = new int[21];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {

            numArr[i] = Integer.parseInt(st.nextToken());
        }

        solve(0, 0);

        // S가 0인 경우 공집합도 포함되므로 개수에서 -1을 빼준다.
        if (S == 0) {
            cnt -= 1;
        }

        System.out.println(cnt);
    }

    static void solve(int sum, int step) {
        System.out.println(sum + " " + step);
        if (step == N) {
            if (sum == S) cnt++;
            return;
        }
        solve(sum, step + 1);
        System.out.println("start : " + sum + ", " + step);
        solve(sum + numArr[step], step + 1);
        System.out.println("END");
    }
}
