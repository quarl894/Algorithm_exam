package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 경로찾기
public class ex_11403 {
    static int nE; //간선 갯수
    static int nV; //Vertex 갯수
    static int[][] ad;   //인접행렬
    static boolean[] visit; //방문 확인

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		nV = N;
		nE = N;
		ad = new int[nV][nV]; // 변수 초기화
	    visit = new boolean[nV]; // 변수 초기화
	    int inf =100; //정점이 최대 100개이므로 100은 갈 수 없는 수.
		//방향 그래프
		for(int i=0; i<N; i++){
			String[] sp = br.readLine().split(" ");
			for(int j=0; j<N; j++){
				ad[i][j] = Integer.parseInt(sp[j]);
				// 연결 없는 것은 inf로 초기화 해줌.
				if(ad[i][j]==0) ad[i][j] = inf;
			}
		}
		//플로이드 알고리즘
		for(int k=0; k<N; k++){
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					//일자가 아닌 중간 경로를 통해 연결되는 것
					if(ad[i][j]>ad[i][k]+ad[k][j]){
						ad[i][j] = ad[i][k] +ad[k][j];
					}
				}
			}
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				//inf값이면 연결점이 없다는 것
				System.out.printf("%d ",ad[i][j] == inf ? 0 :1);
			}
			System.out.println();
		}
		br.close();
	}
}
