package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
최소값 더해주면서 감.

 */
public class bj_1149 {
    static int[][] rgb;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(br.readLine());
        rgb = new int[n][3];
        for(int i=0; i<n; i++){
            String[] tmp = br.readLine().split(" ");
            for(int j=0; j<3; j++){
                rgb[i][j] = Integer.parseInt(tmp[j]);
            }
        }
        if(n==1){
            System.out.println(Math.min(rgb[n-1][0], Math.min(rgb[n-1][1],rgb[n-1][2])));
            return;
        }


        for(int i=1; i<n; i++){
            for(int j=0; j<3; j++){
                if(j==0) rgb[i][j] +=  Math.min(rgb[i-1][1],rgb[i-1][2]);
                else if(j==1) rgb[i][j] += Math.min(rgb[i-1][0],rgb[i-1][2]);
                else rgb[i][j] += Math.min(rgb[i-1][0],rgb[i-1][1]);
            }
        }
        System.out.println(Math.min(rgb[n-1][0], Math.min(rgb[n-1][1],rgb[n-1][2])));
        br.close();
    }
}
