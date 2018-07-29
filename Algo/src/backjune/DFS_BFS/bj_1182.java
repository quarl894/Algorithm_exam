package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1182 {
    static int n;
    static int s;
    static String[] bubun;
    static int ans;
    static boolean[] chk;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        n = Integer.parseInt(tmp[0]);
        s = Integer.parseInt(tmp[1]);
        chk = new boolean[n];
        bubun = br.readLine().split(" ");
        ans = 0;
        if(s==0) ans = -1;
        dfs(0,0);
        System.out.println(ans);
        br.close();

    }

    private static void dfs(int pos, int sum){
        if(sum==s) ans++;

        for(int i=pos; i<n; i++){
            if(!chk[i]){
                chk[i] = true;
                dfs(i+1, sum+Integer.parseInt(bubun[i]));
                chk[i] = false;
            }
        }
        return;
    }
}
