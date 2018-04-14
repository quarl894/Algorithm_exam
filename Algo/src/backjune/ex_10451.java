package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ���� ����� ����
public class ex_10451 {
    static int[][] ad;
    static boolean[] visit;
    static int Nv;
    // �湮������ ��� ī����
    static int count =0;
    public static void dfs(int i){
        visit[i] = true;   // �Լ� ȣ�� ��, visit ������ ǥ��
        
        for(int j = 1; j < Nv+1; j++){
            if(ad[i][j] == 1 && visit[j] == false){// j�� �湮���� �ʾ����� j�� �湮�Ѵ�.
            	dfs(j);
            }
        }
    }
   
	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stk = new StringBuilder();
		int number = Integer.parseInt(br.readLine());
		for(int k=0; k<number; k++){
	    	Nv =  Integer.parseInt(br.readLine());//����
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
