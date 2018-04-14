package Sort;
import java.util.*;

//������ķ� ������ DFS
public class DfsTest {
    static int nE; //���� ����
    static int nV; //Vertex ����
    static int[][] ad;   //�������
    static boolean[] visit; //�湮 Ȯ��
    
    public static void dfs(int i){
        visit[i] = true;   // �Լ� ȣ�� ��, visit ������ ǥ��
        System.out.print(i+ " ");
        
        for(int j = 1; j < nV+1; j++){
            if(ad[i][j] == 1 && visit[j] == false){  // j�� �湮���� �ʾ����� j�� �湮�Ѵ�.
                dfs(j);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        nV = scan.nextInt(); //Vertex ����
        nE = scan.nextInt(); //���� ����
        ad = new int[nV+1][nV+1]; // ���� �ʱ�ȭ
        visit = new boolean[nV+1]; // ���� �ʱ�ȭ
        
        for(int i = 0; i < nE; i++){
            int t1 = scan.nextInt();
            int t2 = scan.nextInt();
            
            ad[t1][t2] = ad[t2][t1] = 1;
        }
        dfs(1); // 1������ Ž�� ����   
    }
}

