package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_5566 {
    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        int n = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);
        int[] map = new int[n];
        int[] dice = new int[m];
        int result = 0;
        int num = 0;
        for(int i=0; i<n; i++){
            map[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<m; i++){
            dice[i] = Integer.parseInt(br.readLine());
        }

        while(result<n-1 && num<m){
            result += dice[num++];
            // map을 초과하는 것을 제한해줘야함.
            if(result>=n-1) break;
            result += map[result];

        }
        System.out.println(num);
        br.close();

    }
}
