package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//���� ����
public class ex_4963 {
	static int count = 0;
    static int[][] graph;
    static int X;
    static int Y;
    
    private static void dfs(int x, int y){
    	//�湮�� �� 0���� �ٲ���
    	graph[x][y] = 0;
    	
    	// Ȯ���� ��(�� �ֺ� ��� Ȯ���ؾ��ϹǷ� 8��) �� ��ġ ���� : (0,0)
    	int[] ax = {0,-1,-1,-1,0,1,1,1};
    	int[] ay = {1,1,0,-1,-1,-1,0,1};
    	
    	for(int i=0; i<8; i++){
    		int dx = x+ax[i];
    		int dy = y+ay[i];
    		
    		//���� ���� ó��
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
			// �Է°� ����
			for(int i=0; i<X; i++){
				String[] sp2 = br.readLine().split(" ");
				for(int j=0; j<Y; j++){
					graph[i][j] = Integer.parseInt(sp2[j]);
				}
			}
			
			//dfs Ž��
			for(int i=0; i<X; i++){
				for(int j=0; j<Y; j++){
					if(graph[i][j]==1){
						//���� ����
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
