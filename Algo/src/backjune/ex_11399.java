package backjune;

import java.util.Arrays;
import java.util.Scanner;

public class ex_11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, sum=0;
		N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<=i; j++){
				sum +=arr[j];
			}
		}
		sc.nextLine();
		System.out.println(sum);
	}
}