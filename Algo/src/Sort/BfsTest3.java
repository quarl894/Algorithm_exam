package Sort;
import java.util.*;

//인접레스트, HashMap으로 구현한 BFS
public class BfsTest3 {
    static ArrayList<ArrayList<Integer>> ad;
    static boolean[] visit;
    static int Ne, Nv;
    
    public static void bfs(int i){
        Queue <Integer>q = new <Integer> LinkedList();
        HashMap<Integer, Boolean> hash = new HashMap<Integer, Boolean>();

        q.offer(i);
        
        while(!q.isEmpty()){
            int temp = q.poll();
            visit[temp] = true;
            System.out.print(temp);
            
            //방문안했고 hash 중복에 없다면 큐에 삽입, hash 삽입(중복체크용)
            for(int j : ad.get(temp)){
                if(visit[j] == false && !hash.containsKey(j)){
                    q.offer(j);
                    hash.put(j, true);
                }
            }
            
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Nv = scan.nextInt();
        Ne = scan.nextInt();
        ad = new <ArrayList<Integer>> ArrayList(Nv+1);
        visit = new boolean[Nv+1];
        
        //초기화
        for(int i = 0; i <= Nv+1; i++){
            ad.add(new ArrayList());
        }
        
        //간선 대입
        for(int i = 0; i < Ne; i++){
            int t1, t2;
            t1 = scan.nextInt();
            t2 = scan.nextInt();
            
            ad.get(t1).add(t2);
            ad.get(t2).add(t1);    
        }   
        bfs(1);        
    }
}