package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//적록색약
public class ex_10026 {
	static boolean[][] visit;
	static char[][] arr;
	static int N;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		arr = new char[N][N];
		visit = new boolean[N][N];
		StringBuilder st = new StringBuilder();
		for(int i=0; i<N; i++){
			char[] str = br.readLine().toCharArray();
			for(int j=0; j<N; j++){
				arr[i][j] = str[j];
			}
		}
		int count =0;
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(!visit[i][j]){
					bfs(i,j,arr[i][j]);
					count++;
				}
			}
		}
		st.append(count);
		st.append(" ");
		count =0;
		
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				visit[i][j] =false;
				if(arr[i][j]=='R') arr[i][j] ='G';
			}
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(!visit[i][j]){
					bfs(i,j,arr[i][j]);
					count++;
				}
			}
		}
		st.append(count);

		System.out.println(st);
			
		br.close();
	}
	
	static private void bfs(int a, int b, char color){
		Queue<RGB> q = new LinkedList<>();
		q.offer(new RGB(a,b,color));
		visit[a][b] = true;
		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		
		while(!q.isEmpty()){
			RGB temp = q.poll();
			for(int i=0; i<4; i++){
				int ax = dx[i] + temp.x;
				int ay = dy[i] + temp.y;
				
				if(ax>=0 && ax<N && ay>=0 && ay<N){
					if(temp.color == arr[ax][ay] && !visit[ax][ay]){
						q.offer(new RGB(ax,ay,arr[ax][ay]));
						visit[ax][ay] = true;
					}
				}
			}
		}
	}

}

final class RGB{
	int x;
	int y;
	char color;
	
	RGB(int x, int y, char color){
		this.x = x;
		this.y = y;
		this.color = color;
	}
}
