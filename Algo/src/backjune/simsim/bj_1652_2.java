package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_1652_2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][n];
        int ver = 0;
        int hor = 0;
        for(int i=0; i<n; i++){
            char[] ch = br.readLine().toCharArray();
            for(int j=0; j<n; j++){
                arr[i][j]= ch[j];
            }
        }

        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i][j]=='.') count++;
                else count=0;
                if(count>=2){
                    ver++;
                    break;
                }
            }
        }

        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(arr[j][i]=='.') count++;
                else count =0;
                if(count>=2){
                    hor++;
                    break;
                }
            }
        }
        System.out.println(ver +" " + hor);
        br.close();

    }
}