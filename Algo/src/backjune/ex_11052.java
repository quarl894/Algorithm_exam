package backjune;

import java.util.Arrays;
import java.util.Scanner;

public class ex_11052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N+1];
		int max[] = new int[N+1];
		max[0] = arr[0]= 0;
		for(int i=1; i<=N; i++){
			arr[i] = sc.nextInt();
		}
		max = Arrays.copyOf(arr, N+1);
		//최대 값 계속 비교
		for(int i=2; i<=N; i++){
			for(int j=1; j<=i; j++){
				max[i] = Math.max(max[j]+arr[i-j], max[i]);
			}
		}
		System.out.println(max[N]);
	}
}
