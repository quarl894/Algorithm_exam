package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_1652 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] map = new char[n][n];
        for(int i=0; i<n; i++) {
            char[] ch = br.readLine().toCharArray();
            for(int j=0; j<n; j++){
                map[i][j] = ch[j];
            }
        }

        int ve = 0;
        int ho = 0;
        //세로
        for(int i=0; i<n; i++){
            for(int j=0; j<n-2; j++){
                if( (map[i][j]== '.') && (map[i][j+1]=='.') && (map[i][j+2]=='.')){
                    int t1 = i+1;
                    if(t1<=n-1){
                        if(map[t1][j+1]=='.') ho++;
                    }
                    int t2 = i-1;
                    if(t2>=0){
                        if(map[t2][j+1]=='.') ho++;
                    }
                }

                if( (map[j][i]=='.') &&  (map[j+1][i]=='.') && (map[j+2][i]=='.')){
                    int t1 = i+1;
                    if(t1<=n-1){
                        if(map[j+1][t1]=='.') ve++;
                    }
                    int t2 = i-1;
                    if(t2>=0){
                        if(map[j+1][t2]=='.') ve++;
                    }
                }
            }
        }

        System.out.println(ve +" " + ho);
    }
}
