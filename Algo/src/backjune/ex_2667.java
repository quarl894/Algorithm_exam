package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

//���� ��ȣ ���̱�
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
		
		//bfs ����
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(ad[i][j]==1){
					arr.add(bfs(i,j));
				}
			}
		}
		
		//�������� ���
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
	
	//������ 4�� Ž���ؼ� �̾����� ���������� Ž��
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
						//Ž���Ѱ� 0���� �ٲ���
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

