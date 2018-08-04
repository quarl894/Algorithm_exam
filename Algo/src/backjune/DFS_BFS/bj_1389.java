package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1389 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        int[][] map = new int[n+1][n+1];

        int result = 0;
        int person = 0;
        for(int i=0; i<m; i++){
            stk = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(stk.nextToken());
            int n2 = Integer.parseInt(stk.nextToken());
            map[n1][n2] = map[n2][n1] = 1;
        }

        for(int k = 1; k<=n; k++){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(i==j) continue;
                    else{
                        if(map[i][k] !=0 && map[k][j]!=0){
                            if(map[i][j]==0) map[i][j] = map[i][k] + map[k][j];
                             else{
                                 if(map[i][j]> map[i][k] + map[k][j] ){
                                     map[i][j] = map[j][i] = map[i][k] + map[k][j];
                                 }
                             }
                        }
                    }
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=1; i<=n; i++){
            result = 0;
            for(int j=1; j<=n; j++){
                result +=map[i][j];
            }
            if(min>result){
               // System.out.println("result:"+ result);
                min = result;
                person = i;
            }
        }
        System.out.println(person);
        br.close();
    }
}
