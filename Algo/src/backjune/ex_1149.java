package backjune;

import java.util.Scanner;

/*
 * RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 
 * 또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다. 집 i의 이웃은 집 i-1과 집 i+1이다. 
 * 처음 집과 마지막 집은 이웃이 아니다.
 * 각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 
 * 모든 집을 칠할 때 드는 비용의 최솟값을 구하는 프로그램을 작성하시오.
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
