package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 연결 요소의 갯수
public class ex_10451 {
    static int[][] ad;
    static boolean[] visit;
    static int Nv;
    // 방문안했을 경우 카운팅
    static int count =0;
    public static void dfs(int i){
        visit[i] = true;   // 함수 호출 시, visit 했음을 표시
        
        for(int j = 1; j < Nv+1; j++){
            if(ad[i][j] == 1 && visit[j] == false){// j를 방문하지 않았으면 j를 방문한다.
            	dfs(j);
            }
        }
    }
   
	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stk = new StringBuilder();
		int number = Integer.parseInt(br.readLine());
		for(int k=0; k<number; k++){
	    	Nv =  Integer.parseInt(br.readLine());//정점
	        ad = new int[Nv+1][Nv+1];
	        visit = new boolean[Nv+1];
	        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	        for(int i = 1; i <= Nv; i++){
	            int num = Integer.parseInt(st.nextToken());
	        	ad[i][num] = 1;
	        }
	        for(int i=1; i<=Nv; i++){
	        	if(!visit[i]){
	        		count++;
	        		dfs(i);
	        	}
	        }
	        stk.append(count);
	        stk.append("\n");
	        count =0;
		}
		System.out.println(stk);
        br.close();
    }   
}
