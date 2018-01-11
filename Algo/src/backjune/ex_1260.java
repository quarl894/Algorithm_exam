package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex_1260 {
	static int[][] graph;
	static boolean visited[];
	static int N;
	static int E;
	static int startPoint;
	
	public static void dfs(int i){
		visited[i] = true;
		System.out.print(i+" ");
		
		for(int j=1; j<=N; j++){
			if(graph[i][j]==1 && visited[j]==false){
				dfs(j);
			}
		}
	}
	
	public static void bfs(int i){
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		visited[i] = true;
		System.out.print(i+" ");
		
		int temp;
		while(!q.isEmpty()){
			temp = q.poll();
			for(int j=0; j<N+1; j++){
				if(graph[temp][j]==1 && visited[j]==false){
					q.offer(j);
					visited[j] = true;
					System.out.print(j+ " ");
				}
			}
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sp = str.split(" ");
		N = Integer.parseInt(sp[0]);
		graph = new int[1001][1001];
		E = Integer.parseInt(sp[1]);
		visited = new boolean[1001];
		startPoint = Integer.parseInt(sp[2]);
		
		int a,b;
		
		for(int i=1; i<=E; i++){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			graph[a][b] = graph[b][a] =1;
		}
		br.close();
		dfs(startPoint);
		for(int j=1; j<=N; j++){
			visited[j] = false;
		}
		System.out.println();
		
		bfs(startPoint);
	}
}
