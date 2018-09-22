package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
단순 사이클만 파악해서는 중복되는 숫자들을 처리하지못하고 시간초과가 남.
한번 탐색할때 그 안에 사이클이 있는지도 확인해 줘야함.
 */
public class bj_9466_3 {
    static int chk[]; // 방문 확인
    static int startver[]; // 종착이 어딘지
    static int arr[]; // 처음 배열

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        while(n-->0){
            int num = Integer.parseInt(br.readLine());
            arr = new int[num+1];
            chk = new int[num+1];
            startver = new int[num+1];
            int k= 1;
            int sum = 0;
            StringTokenizer stk = new StringTokenizer(br.readLine());
            while(stk.hasMoreTokens()){
                arr[k++] = Integer.parseInt(stk.nextToken());
            }

            for(int i=1; i<=num; i++){
                if(chk[i]==0){
                   sum += dfs(i,i,1);
                }
            }
            System.out.println(num-sum); // 전체에서 그룹 수 빼줌.
        }
        br.close();
    }

    private static int dfs(int tmp, int start, int cnt){
        // 방문했을 경우 사이클이냐 아니냐
        if(chk[tmp]!=0){
            if(start !=startver[tmp]) return 0; // 낙오자들은 0으로 리턴
            return cnt - chk[tmp]; // 그룹 수를 리턴해줌.
        }

        chk[tmp] = cnt;
        startver[tmp] = start;

        return dfs(arr[tmp],start,cnt+1);
    }
}
