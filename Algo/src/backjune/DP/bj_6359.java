package backjune.DP;

import java.util.Arrays;
import java.util.Scanner;

public class bj_6359 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        StringBuilder st = new StringBuilder();

        while(t-->0){
            int n = sc.nextInt();
            boolean[] room = new boolean[n+1];
            Arrays.fill(room,true);
            room[0] = false;
            if(n==1) st.append(1 +"\n");
            else{
                for(int j=2; j<=n; j++) {
                    for (int i = j; i <= n; i +=j) {
                        if(!room[i]) room[i] = true;
                        else room[i] = false;
                    }
                }
                int cnt = 0;
                for(boolean a : room){
                    if(a) cnt++;
                }
                st.append(cnt+"\n");
            }
        }
        System.out.print(st);
        sc.close();
    }
}
