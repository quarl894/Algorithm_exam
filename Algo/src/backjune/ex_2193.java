package backjune;

import java.util.Scanner;
// 배열 초과 조심 (N+2)로 한 이유가 앞에 0,1,2를 설정할때 초과방지를 위해 늘림.
public class ex_2193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long zero[] = new long[N+2];
		long one[] = new long[N+2];
		
		zero[0] = 0;
		one[0] = 0;
		zero[1] = 0;
		one[1] = 1;
		zero[2] = 1;
		one[2] = 0;
		for(int i=3; i<=N; i++){
			zero[i] = zero[i-1] + one[i-1];
			one[i] = zero[i-1];
		}
		System.out.println(zero[N]+one[N]);
	}
}
