package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//영역 구하기
public class ex_2583 {
	static int M; //x
	static int N; //y
	static int[][] ad;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		M = Integer.parseInt(sp[0]);
		N = Integer.parseInt(sp[1]);
		int K = Integer.parseInt(sp[2]);
		ad = new int[M][N];
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder st = new StringBuilder();
		for(int i=0; i<K; i++){
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(stk.nextToken());
			int y1 = Integer.parseInt(stk.nextToken());
			int x2 = Integer.parseInt(stk.nextToken());
			int y2 = Integer.parseInt(stk.nextToken());
			for(int j=y1; j<y2; j++){
				for(int k=x1; k<x2; k++){
					ad[j][k] = 1;
				}
			}
		}
		
		for(int i=0; i<M; i++){
			for(int j=0; j<N; j++){
				if(ad[i][j]==0){
					list.add(bfs(i,j));
				}
			}
		}
		st.append(list.size());
		st.append("\n");
		Collections.sort(list);
		for(int a : list){
			st.append(a+ " ");
		}
		System.out.println(st);
		br.close();
		
		
		
	}
	static private int bfs(int x, int y){
		Queue<area> q = new<area>LinkedList();
		int count =1;
        int[] dx = {0,-1,0,1};
        int[] dy = {1,0,-1,0};
		
		ad[x][y] = 1;
		q.offer(new area(x,y));
		
		while(!q.isEmpty()){
			area temp = q.poll();
			for(int i=0; i<4; i++){
				int ax = temp.x + dx[i];
				int ay = temp.y + dy[i];
				if((ax>=0 && ax<M) &&(ay>=0 && ay<N)){
					if(ad[ax][ay]==0){
						ad[ax][ay] = 1;
						q.offer(new area(ax,ay));
						count++;
					}
				}
			}
		}
		return count;
	}

}

final class area{
	int x;
	int y;
	
	area(int x, int y){
		this.x = x;
		this.y = y;
	}
}

