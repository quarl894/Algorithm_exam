package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//미로 탐색
public class ex_2178 {
	static int N; //가로
	static int M; //세로
	static miro exit;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		
		N = Integer.parseInt(sp[0]);
		M = Integer.parseInt(sp[1]);
		int[][] ad = new int[N][M];
		for(int i=0; i<N; i++){
			String str = br.readLine();
			for(int j=0; j<M; j++){
				ad[i][j] = Integer.parseInt(str.substring(j, j+1));
			}
		}
		bfs(ad);
		System.out.println(exit.count);
		br.close();
	}
	static private void bfs(int[][] ad){
		Queue<miro> q = new LinkedList<>();
		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		q.offer(new miro(0,0,1));
		ad[0][0] = 0;
		while(!q.isEmpty()){
			exit = q.poll();
			if(exit.x==N-1 && exit.y==M-1){
				break;
			}
			for(int i=0; i<4; i++){
				int ax = exit.x + dx[i];
				int ay = exit.y + dy[i];

				if(ax>=0 && ax<N && ay>=0 && ay<M){
					if(ad[ax][ay]==1){
						q.offer(new miro(ax,ay,exit.count+1));
						ad[ax][ay]=0; //poll말고 offer할때  체크해줘야 시간줄일수있음.
					}
				}
			}
		}
	}

}

final class miro{
	int x;
	int y;
	int count;
	miro(int x, int y, int count){
		this.x = x;
		this.y = y;
		this.count = count;
	}
}
