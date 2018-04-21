package gg;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class dfs_bfs {
	static int[][] graph;
	static int V;
	static int E;
	static int startPoint;
	static boolean[] visit;

	private static void dfs(int num){
		//방문시 확인
		visit[num] = true;
		System.out.print(num+" ");
		
		//간선이 있고 방문한 적이 없다면 탐색
		for(int i=1; i<=V; i++){
			if(graph[num][i]==1 && visit[i]==false){
				dfs(i);
			}
		}
	}
	
	private static void bfs(int num){
		Queue<Integer> q = new LinkedList<Integer>();
		// 큐 삽입
		q.offer(num);
		visit[num] = true;
		
		// 전부 출력될때까지
		while(!q.isEmpty()){
			//탐색 정점을 pop함
			int temp = q.poll();
			System.out.print(temp+ " ");
			//간선이 있고 방문한 적이 없다면
			//pop한 원소의 인접정점을 psuh함.
			for(int i=1; i<=V; i++){
				if(graph[temp][i]==1 && visit[i]==false){
					q.offer(i);
					visit[i]= true;
				}
			}
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		V = Integer.parseInt(str[0]);
		E = Integer.parseInt(str[1]);
		startPoint = Integer.parseInt(str[2]);
		// 1부터 하기 위해서 +1씩 해줌.
		graph = new int[V+1][V+1];
		visit = new boolean[V+1];
		for(int i=1; i<=E; i++){
			String[] str2 = br.readLine().split(" ");
			int t1 = Integer.parseInt(str2[0]);
			int t2 = Integer.parseInt(str2[1]);
			
			graph[t1][t2] = graph[t2][t1] =1;
		}
		br.close();
		dfs(startPoint);
		//visit 초기화
		for(int i=1; i<=V; i++) visit[i] = false;
		System.out.println();
		bfs(startPoint);
	}

}
