package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//¹ì
public class ex_3190 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		int[][] map = new int[N+2][N+2];
		for(int i=0; i<N+2; i++){
			for(int j=0; j<N+2; j++){
				if(i==0 || i==N+1 || j==0 || j==N+1) map[i][j] = 1;
				else map[i][j] = 0;
			}
		}
		
		for(int i=0; i<K; i++){
			StringTokenizer stk = new StringTokenizer(br.readLine());
			map[Integer.parseInt(stk.nextToken())][Integer.parseInt(stk.nextToken())] = 2;
		}
		
		
		
	}

}
