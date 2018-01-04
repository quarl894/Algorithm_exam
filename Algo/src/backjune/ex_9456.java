package backjune;

import java.util.Arrays;
import java.util.Scanner;

// ��ƼĿ ���� �ִ밪 ���ϱ� 
// ��ƼĿ�� ���� ������ ��ƼĿ�� ��� ����. �ִ������� ����  �����ϱ�?
public class ex_9456 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int number = sc.nextInt();
		for(int i=0; i<number; i++){
			int N = sc.nextInt();
			output(N);
		}
	}
	
	private static void output(int N){
		int sticker[][] = new int[2][N];
		for(int i=0; i<2; i++){
			for(int j=0; j<N; j++){
				sticker[i][j] = sc.nextInt();
			}
		}
	
		sticker[1][1] +=sticker[0][0];
		sticker[0][1] +=sticker[1][0];
		
		for(int j=2; j<N; j++){
			sticker[0][j] += Math.max(sticker[1][j-2], sticker[1][j-1]);
			sticker[1][j] += Math.max(sticker[0][j-2], sticker[0][j-1]);
			}
		System.out.println(Math.max(sticker[0][N-1],sticker[1][N-1]));
	}
		
}
