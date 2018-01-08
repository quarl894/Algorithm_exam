package backjune;

import java.util.Scanner;

public class ex_2167 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N,M;
		int a,b,c,d;
		N= sc.nextInt();
		M = sc.nextInt();
		int dp[][] = new int[N][M];
		
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				dp[i][j] = sc.nextInt();
			}
		}
		int num = sc.nextInt();
		for(int i=0; i<num; i++){
			a =sc.nextInt();
			b= sc.nextInt();
			c= sc.nextInt();
			d= sc.nextInt();
			System.out.println(sum(a,b,c,d,dp));
		}
	}
	// ¿­¸ÕÀú Å½»ö
	private static int sum(int a, int b, int c, int d, int dp[][]){
		int result=0;
		for(int j=(b-1); j<d; j++){
			for(int i=(a-1); i<c; i++){
				result += dp[i][j];
			}
		}
		return result;
	}
}
