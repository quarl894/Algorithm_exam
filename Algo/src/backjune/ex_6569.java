package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//몬트리안의 꿈
//홀수 *홀수는 만들수 없음
// 기본 2*N타일과 비슷한것같으나 안풀림..
public class ex_6569 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int h = Integer.parseInt(br.readLine());
		int w = Integer.parseInt(br.readLine());
		int max, min;
		br.close();
		int[][] dp = new int[12][12];
		for(int i=0; i<12; i++){
			dp[0][i] = 1;
			dp[i][0] = 1;
		}
		for(int i=1; i<12; i++){
			if(i%2==0) dp[1][i] = 1;
			else dp[1][i] = 0;
			dp[i][1] = dp[1][i];
		}
		dp[2][2] = 2;
		dp[2][3] = 3;
		if(h>w){
			max =h; min=w;
		}
		else{
			max=w; min =h;
		}
		for(int i=3; i<=11; i++){
			for(int j=i; j<=11; j++){
				if(i%2==0){
					dp[i][j] = (dp[i][j-1] + dp[i][j-2]);
					dp[j][i] = dp[i][j];
					//System.out.println("i="+i +", j="+j +": "+ dp[i][j]);
				}else{
					if(j%2==0) dp[i][j] = (dp[i][j-2])*3;
					else{
						dp[i][j] = 0; 
					}
					dp[j][i] = dp[i][j];
					//System.out.println("i="+i +", j="+j +": "+ dp[i][j]);
				}
			}
		}
		System.out.println(dp[h][w]);
	}

}
