package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class bj_1963 {
    static int[] p_num;
    static boolean[] visited;
    static ArrayList<Integer> arr = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] c = new boolean[10001];
        visited = new boolean[10001];
        //소수 구하기
        for(int i=2;i<=10000; i++) {
            if(!c[i]){
                if(i>1000) arr.add(i);
                for(int j=2*i; j<=10000; j+=i){
                    c[j] = true;
                }
            }
        }

        while(n-->0){
            String[] t = br.readLine().split(" ");
            int s = Integer.parseInt(t[0]);
            int e = Integer.parseInt(t[1]);
            bfs(s,e);
            Arrays.fill(visited,false);
        }
        br.close();
    }

    private static void bfs(int s, int e){
        Queue<xy> q = new LinkedList<>();

        q.offer(new xy(s,0));
        visited[s] = true;
        int result = s;
        int ans = 0;

        while(!q.isEmpty() && result!=e){
            xy t = q.poll();
            result = t.x;
            ans = t.cnt;

            for(int i=0; i<arr.size(); i++){
                if(!visited[arr.get(i)]){
                    int tmp = chk(result,arr.get(i));
                    if(tmp!=0) q.offer(new xy(tmp,ans+1));
                }
            }
        }
        if(result!=e) System.out.println("Impossible");
        else System.out.println(ans);
    }

    private static class xy{
        int x;
        int cnt;

        public xy(int x, int cnt) {
            this.x = x;
            this.cnt = cnt;
        }
    }

    private static int chk(int num, int num2){
        int[] temp = new int[4];
        temp[0] = num / 1000;
        temp[1] = (num / 100) % 10;
        temp[2] = (num / 10) % 10;
        temp[3] = num % 10;

        int[] temp2 = new int[4];
        temp2[0] = num2 / 1000;
        temp2[1] = (num2 / 100) % 10;
        temp2[2] = (num2 / 10) % 10;
        temp2[3] = num2 % 10;

        int cnt = 0;
        for(int i=0; i<4; i++){
            if(temp[i]==temp2[i]) cnt++;
        }
        if(cnt==3){
            visited[num2] = true;
            return num2;
        }
        else return 0;

    }


}
