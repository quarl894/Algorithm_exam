package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//토마토
public class ex_7576_2 {
	static int[][] graph;
    static int M;
    static int N;
    static int temp =0;
    static Queue <AB> q;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		M = Integer.parseInt(sp[0]); //가로 y
		N = Integer.parseInt(sp[1]); // 세로 x
		q = new <AB> LinkedList();
		graph = new int[N][M];
		for(int i=0; i<N; i++){
			StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<M; j++){
				graph[i][j] = Integer.parseInt(stk.nextToken());
			}
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				if(graph[i][j]==1){
					q.offer(new AB(i,j,0));
				}
			}
		}
		bfs();
		int count =0;
		
		for(int i=0; i<N; i++){
			//System.out.println();
			for(int j=0; j<M; j++){
				//System.out.printf(graph[i][j] + " ");
				if(graph[i][j]==0){
					count = -1;
					break;
				}
			}
		}
		
		if(count==-1) System.out.println(-1);
		else System.out.println(temp);
		
		br.close();
	}

    public static void bfs(){
        int[] dx = {0,-1,0,1};
        int[] dy = {1,0,-1,0};
        while(!q.isEmpty()){
            AB move = q.poll();
            for(int j=0; j<4; j++){
            	int ax = move.x + dx[j];
            	int ay = move.y+dy[j];
            	int day1 = move.day;
            	temp = day1;
            	if((ax>=0 && ax<N) &&(ay>=0 && ay<M)){
	                if(graph[ax][ay] == 0){
	                    graph[ax][ay] =1;
	                    q.offer(new AB(ax,ay,day1+1));
	                }
	                }
            	}

            }
    }
}

class AB{
	int x;
	int y;
	int day;
	AB(int x, int y, int day){
		this.x = x;
		this.y = y;
		this.day =day;
	}
}
