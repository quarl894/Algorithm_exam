package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

/*
7자리 소수 구하기이므로
7자리까지 소수를 미리 구해놓자. 에라토스테네스 체로.

 */
public class bj_3671 {
    static char[] ch;
    static HashMap<Integer,Boolean> hash;
    static boolean[] visited;
    static int len;
    static int ans;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        visited = new boolean[10000000];
        hash = new HashMap<>();
        for(int i=0; i<=10000000; i++){
            hash.put(i,false);
        }

        // 소수 구하기.
        for(int i=2; (i*i)<10000000; i++){
            if(!hash.get(i)){
                for(int j=i*i; j<10000000; j+=i){
                    hash.put(j,true); // ture면 소수가 아님.
                }
            }
        }

        while(n-->0){
            String str = br.readLine();
            ch = str.toCharArray();
            len = ch.length;
            ans = 0;
            backtracking(0,0);
            System.out.println(ans);
            Arrays.fill(visited,false);
        }
        br.close();


    }


    private static void backtracking(int l, int num){
        StringBuilder st = new StringBuilder();
        if(!hash.get(num)){
            ans++;
            if(l==len){
                return;
            }else{
                st.append(num);
                st.append(ch[l+1]);
                backtracking(l+1,Integer.parseInt(st.toString()));
                visited[Integer.parseInt(st.toString())] = false;
            }
        }else{
            return;
        }

        for(int i=0; i<ch.length; i++){
            st.append(ch[i]);
            int tmp = Integer.parseInt(st.toString());
            if(!visited[tmp]) {
                visited[tmp] = true;
                backtracking(l + 1, tmp);
                visited[tmp] = false;
            }
        }

    }

}
