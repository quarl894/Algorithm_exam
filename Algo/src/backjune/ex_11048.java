package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//이동하기
public class ex_11048 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] sp = br.readLine().split(" ");
		int x = Integer.parseInt(sp[0]);
		int y = Integer.parseInt(sp[1]);
		StringTokenizer stk;
		int dp[][] = new int[x][y];
		int[][] miro = new int[x][y];
		for(int i=0; i<x; i++){
			stk = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<y; j++){
				miro[i][j] = Integer.parseInt(stk.nextToken());
				//0일때는 경우의수가 1가지 밖에없으니 바로 대입
				if(i==0 && j==0) dp[0][0] = miro[i][j];
				if(i==0 && j!=0) dp[0][j] +=dp[0][j-1]+miro[i][j];
				if(j==0 && i!=0) dp[i][0] +=dp[i-1][0]+miro[i][j];
			}
		}
		
		// dp[i][j]는 x한칸 이동 or y한칸 이동 밖에 경우의수가 없음.
		for(int i=1; i<x; i++){
			for(int j=1; j<y; j++){
				dp[i][j] = Math.max(dp[i-1][j] + miro[i][j],dp[i][j-1]+miro[i][j]);
			}
		}
		System.out.println(dp[x-1][y-1]);
		br.close();
	}

}
