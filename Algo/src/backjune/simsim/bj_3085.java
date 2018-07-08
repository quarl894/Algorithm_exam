package backjune.simsim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_3085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] candy = new String[N][N];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<str.length(); j++){
                candy[i][j] = str.substring(j,j+1);
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                String temp = candy[i][j];
            }
        }
    }
}
