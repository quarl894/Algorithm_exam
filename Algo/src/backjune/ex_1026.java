package backjune;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * ���� ������ ������ �׻� ū ��ĩ�Ÿ����� ���� �־���. �� ������ ���� �������� ������ ���� ������ ���� ū ����� �ɾ���.
���̰� N�� ���� �迭 A�� B�� �ִ�. ������ ���� �Լ� S�� ��������.
S = A[0]*B[0] + ... + A[N-1]*B[N-1]
S�� ���� ���� �۰� ����� ���� A�� ���� ��迭����. ��, B�� �ִ� ���� ��迭�ϸ� �ȵȴ�.
S�� �ּڰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class ex_1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> a= new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i=0; i<N; i++){
			a.add(sc.nextInt());
		}
		for(int i=0; i<N; i++){
			b.add(sc.nextInt());
		}
		Collections.sort(a);
		Collections.sort(b);
		Collections.reverse(a);
		int sum=0;
		for(int i=0; i<N; i++){
			sum +=a.get(i)*b.get(i);
		}
		System.out.println(sum);
	}

}
