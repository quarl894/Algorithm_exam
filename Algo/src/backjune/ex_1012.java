package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//유기농 배추
public class ex_1012 {
	static int M;
	static int N;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder st = new StringBuilder();
		for(int i=0; i<num; i++){
			String[] sp = br.readLine().split(" ");
			M = Integer.parseInt(sp[0]); //가로 y
			N = Integer.parseInt(sp[1]); //세로 x
			int K = Integer.parseInt(sp[2]); //갯수
			
			int dp[][] = new int[N][M];
			for(int j=0; j<K; j++){
				StringTokenizer stk = new StringTokenizer(br.readLine());
				int y = Integer.parseInt(stk.nextToken());
				int x = Integer.parseInt(stk.nextToken());
				dp[x][y] = 1; 
			}
			int counting =0;
			for(int k=0; k<N; k++){
				for(int j=0; j<M; j++){
					if(dp[k][j]==1){
						bfs(dp,k,j);
						counting++;
					}
				}
			}
			st.append(counting);
			st.append("\n");
			counting =0;
		}
		System.out.println(st);
		br.close();
	}
	
	static private void bfs(int[][] dp, int x, int y){
		Queue<vechu> q = new<vechu>LinkedList();
        int[] dx = {0,-1,0,1};
        int[] dy = {1,0,-1,0};
		
		dp[x][y] = 0;
		q.offer(new vechu(x,y));
		
		while(!q.isEmpty()){
			vechu temp = q.poll();
			for(int i=0; i<4; i++){
				int ax = temp.x + dx[i];
				int ay = temp.y + dy[i];
				if((ax>=0 && ax<N) &&(ay>=0 && ay<M)){
					if(dp[ax][ay]==1){
						dp[ax][ay] = 0;
						q.offer(new vechu(ax,ay));
					}
				}
			}
		}
	}
}

final class vechu{
	int x;
	int y;
	
	vechu(int x, int y){
		this.x = x;
		this.y = y;
	}
}
