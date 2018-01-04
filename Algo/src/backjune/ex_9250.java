package backjune;

import java.util.Scanner;

/*
 * ���� S�� ũ�Ⱑ N�̰�, ���Ұ� ���ڿ��� �����̴�. Q���� ���ڿ��� �־����� ��, 
 * �� ���ڿ��� �κ� ���ڿ��� ���� S�� �ִ� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * ���ڿ��� ���� �κ� ���ڿ� �� �ϳ��� ���� S�� ������ 'YES'�� ����ϰ�, �ƹ��͵� ������ 'NO'�� ����Ѵ�.
 * ���� ���, ���� S = {"www","woo","jun"} �� ��, "myungwoo"�� �κ� ���ڿ��� "woo" �� ���� S�� �����Ƿ� ���� 'YES'�̰�, 
 * "hongjun"�� �κ� ���ڿ� "jun"�� ���� S�� �����Ƿ� ���� 'YES'�̴�. 
 * ������, "dooho"�� ��� �κ� ���ڿ��� ���� S�� ���� ������ ���� 'NO'�̴�.
 */
public class ex_9250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,M;
		String words;
		
		N = sc.nextInt();
		String[] arr = new String[N];
		for(int i=0; i<N; i++){
			arr[i] = sc.next();
		}
		M = sc.nextInt();
		for(int i=0; i<M; i++){
			words = sc.next();
			for(int j=0; j<N; j++){
				if(words.contains(arr[j])){
					System.out.println("YES");
					break;
				}else if(j==N-1){
					System.out.println("NO");
				}
			}
		}
	}
}
