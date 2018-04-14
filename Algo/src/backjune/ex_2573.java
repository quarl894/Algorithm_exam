package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//빙산
public class ex_2573 {
	static int[][] gp;
	static int N;
	static int M;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		N = Integer.parseInt(sp[0]);
		M = Integer.parseInt(sp[1]);
		gp = new int[N][M];
		int count =0;
		for(int i=0; i<N; i++){
			StringTokenizer stk = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++){
				gp[i][j] = Integer.parseInt(stk.nextToken());
			}
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				if(gp[i][j]!=0){
					bfs(i,j);
					count++;
				}
			}
		}
		
		System.out.println(count);
		br.close();
		
	}
	
	static private void bfs(int x, int y){
		Queue<xy1> q = new LinkedList<>();
		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		q.offer(new xy1(x,y));
		while(!q.isEmpty()){
			xy1 check = q.poll();
				for(int i=0; i<4; i++){
					int ax = check.x +dx[i];
					int ay = check.y +dy[i];
					if(ax>=0 && ax<N && ay>=0 && ay<M){
						if(gp[ax][ay]==0){
							//주변 0 찾기
							gp[check.x][check.y]--;
							if(gp[check.x][check.y]<0){
								gp[check.x][check.y]=0; 
								break;
							}
						}else{
							//q.offer(new xy1(ax,ay));
						}
					}
				}
		}
		
	}
}

final class xy1{
	int x;
	int y ;
	
	xy1(int x, int y){
		this.x = x;
		this.y = y;
	}
}
