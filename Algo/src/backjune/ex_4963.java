package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//섬의 개수
public class ex_4963 {
	static int count = 0;
    static int[][] graph;
    static int X;
    static int Y;
    
    private static void dfs(int x, int y){
    	//방문한 곳 0으로 바꿔줌
    	graph[x][y] = 0;
    	
    	// 확인할 곳(내 주변 모두 확인해야하므로 8곳) 내 위치 기준 : (0,0)
    	int[] ax = {0,-1,-1,-1,0,1,1,1};
    	int[] ay = {1,1,0,-1,-1,-1,0,1};
    	
    	for(int i=0; i<8; i++){
    		int dx = x+ax[i];
    		int dy = y+ay[i];
    		
    		//범위 예외 처리
    		if((dx>=0 && dx<X) &&(dy>=0 && dy<Y)){
    			if(graph[dx][dy]==1){
        			dfs(dx,dy);
        		}else{
        			continue;
        		}
    		}
    	}
    }
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder st = new StringBuilder();
		
		while(true){
			String[] sp = br.readLine().split(" ");
			Y= Integer.parseInt(sp[0]);
			X= Integer.parseInt(sp[1]);
			
			if(X==0 && Y==0) break;
			
			graph = new int[X][Y];
			// 입력값 저장
			for(int i=0; i<X; i++){
				String[] sp2 = br.readLine().split(" ");
				for(int j=0; j<Y; j++){
					graph[i][j] = Integer.parseInt(sp2[j]);
				}
			}
			
			//dfs 탐색
			for(int i=0; i<X; i++){
				for(int j=0; j<Y; j++){
					if(graph[i][j]==1){
						//섬의 갯수
						count++;
						dfs(i,j);
					}
				}
			}
			st.append(count);
			st.append("\n");
			count =0;
		}
		
		System.out.println(st);
		br.close();
    }
}
