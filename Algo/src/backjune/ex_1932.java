package backjune;

import java.util.Arrays;
import java.util.Scanner;

public class ex_1932 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		int[][] arr = new int[N][N];
		arr[0][0] = sc.nextInt();
		for(int i=1; i<N; i++){
			for(int j=0; j<=i; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		sum(arr, N);
	}
	
	private static void sum(int[][] arr, int num){
		for(int i=1; i<num; i++){
			for(int j=0; j<=i; j++){
				if(j==0){
					// ¸Ç ¿ÞÂÊÀÏ¶§
					arr[i][j] += arr[i-1][j];
				}else if(j==i){
					arr[i][j] += arr[i-1][j-1];
				}else{
					arr[i][j] += max(arr[i-1][j-1],arr[i-1][j]);
				}
			}
		}
		int max = arr[num-1][0];
		for(int i=1; i<num; i++){
			if(max<arr[num-1][i]){
				max = arr[num-1][i];
			}
		}
		System.out.println(max);

	}
	public static int max(int a, int b) {
		if (a < b) {
			return b;
		} else {
			return a;
		}
	}
}
