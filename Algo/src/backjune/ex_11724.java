package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 연결 요소의 갯수
public class ex_11724 {
    static int[][] ad;
    static boolean[] visit;
    static int Ne, Nv;
    static int count =0;
    static int result =0;
    public static void dfs(int i){
        visit[i] = true;   // 함수 호출 시, visit 했음을 표시
        
        for(int j = 1; j < Nv+1; j++){
            if(ad[i][j] == 1 && visit[j] == false){// j를 방문하지 않았으면 j를 방문한다.
            	//System.out.print(j+ " ");
            	//count++;
            	dfs(j);
            }
        }
    }
   
	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	String[] spl = br.readLine().split(" ");
    	Nv =  Integer.parseInt(spl[0]);//정점
        Ne = Integer.parseInt(spl[1]);; //간선
        ad = new int[Nv+1][Nv+1];
        visit = new boolean[Nv+1];
        for(int i = 0; i < Ne; i++){
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int t1, t2;
            t1 = Integer.parseInt(st.nextToken());
            t2 = Integer.parseInt(st.nextToken());
            //양방향
            ad[t1][t2] = ad[t2][t1] = 1;
        }
        br.close();
        for(int i=1; i<=Nv; i++){
        	if(!visit[i]){
        		count++;
        		dfs(i);
        	}
        }
        System.out.println(count);
    }   

}
