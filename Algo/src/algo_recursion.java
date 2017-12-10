import java.util.Scanner;

public class algo_recursion {
	//1부터 n까지 합을 계산하는 반복 함수와 재귀 함수
	//필수 조건 n>=1
	//결과 : 1부터 n까지 합을 반환한다.
	public static void main(String[] args) {
		int N, result;
		System.out.println("n 입력 :");
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		result = recursionSum(N);
		System.out.printf("%d까지의 전체 쌍의 갯수는, %d",N,recursionSum(N));
	}
	static public int recursionSum(int n){
		if(n ==2) return 1;
		return (n-1)*recursionSum(n-2);
	}
}

