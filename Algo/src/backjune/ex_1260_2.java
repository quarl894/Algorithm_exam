package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 인접행렬, Visit을 사용한 BFS
public class ex_1260_2{
    static int[][] ad;
    static boolean[] visit;
    static int Ne, Nv;
    
    public static void dfs(int i){
        visit[i] = true;   // 함수 호출 시, visit 했음을 표시
        System.out.print(i+ " ");
        
        for(int j = 1; j < Nv+1; j++){
            if(ad[i][j] == 1 && visit[j] == false){  // j를 방문하지 않았으면 j를 방문한다.
                dfs(j);
            }
        }
    }
    
    public static void bfs(int i){
        Queue <Integer> q = new LinkedList<Integer>();
        
        q.offer(i);
        visit[i] = true;
        
        while(!q.isEmpty()){
            int temp = q.poll();
            System.out.print(temp+" ");
            
            for(int j = 1; j <= Nv; j++){
                if(ad[temp][j] == 1 && visit[j] == false){
                    q.offer(j);
                    visit[j] = true; // 큐에 넣을 노드들을 잠재적으로 방문한다는 가정하에 입력
                    }
                }
            }
    }
    
    public static void main(String[] args) throws Exception{
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	String[] spl = br.readLine().split(" ");
    	Nv =  Integer.parseInt(spl[0]);//정점
        Ne = Integer.parseInt(spl[1]);; //간선
        int num = Integer.parseInt(spl[2]);
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
        dfs(num);
        for(int i=0; i<Nv+1; i++) visit[i]=false;
        System.out.println();
        bfs(num);   
    }   
}

