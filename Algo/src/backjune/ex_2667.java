package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

//단지 번호 붙이기
public class ex_2667 {
	static int[][] ad;
	static boolean[][] visit;
	static int N;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		ad = new int[N][N];
		visit = new boolean[N][N];
		for(int i=0; i<N; i++){
			String str = br.readLine();
			for(int j=0; j<N; j++){
				ad[i][j] = Integer.valueOf(str.charAt(j)-48);
			}
		}
		
		//bfs 실행
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(ad[i][j]==1){
					arr.add(bfs(i,j));
				}
			}
		}
		
		//오름차순 출력
		Collections.sort(arr);
		StringBuilder st = new StringBuilder();
		st.append(arr.size());
		st.append("\n");
		for(int i=0; i<arr.size(); i++){
			st.append(arr.get(i));
			st.append("\n");
		}
		System.out.println(st);
		br.close();
	}
	
	//인접한 4변 탐색해서 이어지지 않을때가지 탐색
	static private int bfs(int x, int y){
		Queue<complex> q = new <complex>LinkedList();
		ad[x][y] =0;
		q.offer(new complex(x,y));
		
		int[] dx = {0,-1,0,1};
	    int[] dy = {1,0,-1,0};
	    int count = 1;
		while(!q.isEmpty()){
			complex temp = q.poll();
			for(int i=0; i<4; i++){
				int ax = temp.x + dx[i];
				int ay = temp.y + dy[i];
				
				if(ax>=0 && ax<N && ay>=0 && ay<N){
					if(ad[ax][ay]==1){
						q.offer(new complex(ax,ay));
						//탐색한곳 0으로 바꿔줌
						ad[ax][ay] = 0;
						count ++;
					}
				}
			}
		}
		return count;
	}
}

final class complex{
	int x;
	int y;
	complex(int x, int y){
		this.x = x;
		this.y = y;
	}
}

