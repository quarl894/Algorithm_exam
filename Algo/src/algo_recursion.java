import java.util.Scanner;

public class algo_recursion {
	//1���� n���� ���� ����ϴ� �ݺ� �Լ��� ��� �Լ�
	//�ʼ� ���� n>=1
	//��� : 1���� n���� ���� ��ȯ�Ѵ�.
	public static void main(String[] args) {
		int N, result;
		System.out.println("n �Է� :");
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		result = recursionSum(N);
		System.out.printf("%d������ ��ü ���� ������, %d",N,recursionSum(N));
	}
	static public int recursionSum(int n){
		if(n ==2) return 1;
		return (n-1)*recursionSum(n-2);
	}
}

