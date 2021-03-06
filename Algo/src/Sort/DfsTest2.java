package Sort;
import java.util.*;

//인접 리스트를 통한 DFS 설계
public class DfsTest2{
    static int Nv; //vertex 갯수
    static int Ne; //간선 수
    static boolean[] visit; //방문 확인
    static ArrayList<ArrayList<Integer>> ad;
    
    public static void dfs(int i){
        visit[i] = true;
        System.out.print(i);
        
        for(int j : ad.get(i)){  // 배열 null check
            if(visit[j] == false){
                dfs(j);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Nv = scan.nextInt();
        Ne = scan.nextInt();
        ad = new ArrayList(Nv+1); // 인접 리스트 초기화
        visit = new boolean[Nv+1]; // visit 배열 초기화
        
        for(int i = 0; i < Nv+1; i++){ // 인접 리스트 속의 리스트 초기화
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