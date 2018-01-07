package backjune;

import java.util.Scanner;

public class ex_9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N; i++){
			int num = sc.nextInt();
			System.out.println(result(num));
		}
		sc.close();
	}

	private static int result(int n){
		if(n==0) return 0;
		else if(n==1) return 1;
		else if(n==2) return 2;
		else if(n==3) return 4;
		int arr[] = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		for(int j = 4; j <= n; j++){
			arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
			}
		return arr[n];
	}
}
