package Sort;
import java.util.*;

//���� ����Ʈ�� ���� DFS ����
public class DfsTest2{
    static int Nv; //vertex ����
    static int Ne; //���� ��
    static boolean[] visit; //�湮 Ȯ��
    static ArrayList<ArrayList<Integer>> ad;
    
    public static void dfs(int i){
        visit[i] = true;
        System.out.print(i);
        
        for(int j : ad.get(i)){  // �迭 null check
            if(visit[j] == false){
                dfs(j);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Nv = scan.nextInt();
        Ne = scan.nextInt();
        ad = new ArrayList(Nv+1); // ���� ����Ʈ �ʱ�ȭ
        visit = new boolean[Nv+1]; // visit �迭 �ʱ�ȭ
        
        for(int i = 0; i < Nv+1; i++){ // ���� ����Ʈ ���� ����Ʈ �ʱ�ȭ
            ad.add(new ArrayList());
        }
        
        for(int i = 0; i < Ne; i++){
            int t1 = scan.nextInt();
            int t2 = scan.nextInt();
            
            ad.get(t1).add(t2);
            ad.get(t2).add(t1);
        }   
        dfs(1);    
    }
}