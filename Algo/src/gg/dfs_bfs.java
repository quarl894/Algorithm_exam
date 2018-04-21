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
		//�湮�� Ȯ��
		visit[num] = true;
		System.out.print(num+" ");
		
		//������ �ְ� �湮�� ���� ���ٸ� Ž��
		for(int i=1; i<=V; i++){
			if(graph[num][i]==1 && visit[i]==false){
				dfs(i);
			}
		}
	}
	
	private static void bfs(int num){
		Queue<Integer> q = new LinkedList<Integer>();
		// ť ����
		q.offer(num);
		visit[num] = true;
		
		// ���� ��µɶ�����
		while(!q.isEmpty()){
			//Ž�� ������ pop��
			int temp = q.poll();
			System.out.print(temp+ " ");
			//������ �ְ� �湮�� ���� ���ٸ�
			//pop�� ������ ���������� psuh��.
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
		// 1���� �ϱ� ���ؼ� +1�� ����.
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
		//visit �ʱ�ȭ
		for(int i=1; i<=V; i++) visit[i] = false;
		System.out.println();
		bfs(startPoint);
	}

}
