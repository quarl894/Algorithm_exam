package backjune;

import java.util.Scanner;
// �迭 �ʰ� ���� (N+2)�� �� ������ �տ� 0,1,2�� �����Ҷ� �ʰ������� ���� �ø�.
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
