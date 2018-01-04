package backjune;

import java.util.Scanner;

/*
 * RGB�Ÿ��� ��� ������� ���� ����, �ʷ�, �Ķ��߿� �ϳ��� ĥ�Ϸ��� �Ѵ�. 
 * ����, �׵��� ��� �̿��� ���� ������ ĥ�� �� ���ٴ� ��Ģ�� ���ߴ�. �� i�� �̿��� �� i-1�� �� i+1�̴�. 
 * ó�� ���� ������ ���� �̿��� �ƴϴ�.
 * �� ���� �������� ĥ�� �� ��� ���, �ʷ����� ĥ�� �� ��� ���, �Ķ����� ��� ����� �־��� ��, 
 * ��� ���� ĥ�� �� ��� ����� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class ex_1149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] RGB = new int[N][3];
		
		for(int i=0; i<3; i++){
			RGB[0][i] = sc.nextInt();
		}
		
		for(int i=1; i<N; i++){
			for(int j=0; j<3; j++){
				int num = sc.nextInt();
				if(j==0) RGB[i][j] = num +Math.min(RGB[i-1][1], RGB[i-1][2]);
				else if(j==1) RGB[i][j] = num +Math.min(RGB[i-1][0], RGB[i-1][2]);
				else RGB[i][j] = num +Math.min(RGB[i-1][0], RGB[i-1][1]);
			}
		}
		System.out.println(Math.min(RGB[N-1][0], Math.min(RGB[N-1][1], RGB[N-1][2])));
	}
}
