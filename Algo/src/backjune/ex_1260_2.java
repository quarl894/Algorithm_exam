package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// �������, Visit�� ����� BFS
public class ex_1260_2{
    static int[][] ad;
    static boolean[] visit;
    static int Ne, Nv;
    
    public static void dfs(int i){
        visit[i] = true;   // �Լ� ȣ�� ��, visit ������ ǥ��
        System.out.print(i+ " ");
        
        for(int j = 1; j < Nv+1; j++){
            if(ad[i][j] == 1 && visit[j] == false){  // j�� �湮���� �ʾ����� j�� �湮�Ѵ�.
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
                    visit[j] = true; // ť�� ���� ������ ���������� �湮�Ѵٴ� �����Ͽ� �Է�
                    }
                }
            }
    }
    
    public static void main(String[] args) throws Exception{
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	String[] spl = br.readLine().split(" ");
    	Nv =  Integer.parseInt(spl[0]);//����
        Ne = Integer.parseInt(spl[1]);; //����
        int num = Integer.parseInt(spl[2]);
        ad = new int[Nv+1][Nv+1];
        visit = new boolean[Nv+1];
        
        for(int i = 0; i < Ne; i++){
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int t1, t2;
            t1 = Integer.parseInt(st.nextToken());
            t2 = Integer.parseInt(st.nextToken());
            //�����
            ad[t1][t2] = ad[t2][t1] = 1;
        }
        br.close();
        dfs(num);
        for(int i=0; i<Nv+1; i++) visit[i]=false;
        System.out.println();
        bfs(num);   
    }   
}

