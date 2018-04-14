package Sort;
import java.util.*;

//인접행렬로 구현한 DFS
public class DfsTest {
    static int nE; //간선 갯수
    static int nV; //Vertex 갯수
    static int[][] ad;   //인접행렬
    static boolean[] visit; //방문 확인
    
    public static void dfs(int i){
        visit[i] = true;   // 함수 호출 시, visit 했음을 표시
        System.out.print(i+ " ");
        
        for(int j = 1; j < nV+1; j++){
            if(ad[i][j] == 1 && visit[j] == false){  // j를 방문하지 않았으면 j를 방문한다.
                dfs(j);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        nV = scan.nextInt(); //Vertex 갯수
        nE = scan.nextInt(); //간선 갯수
        ad = new int[nV+1][nV+1]; // 변수 초기화
        visit = new boolean[nV+1]; // 변수 초기화
        
        for(int i = 0; i < nE; i++){
            int t1 = scan.nextInt();
            int t2 = scan.nextInt();
            
            ad[t1][t2] = ad[t2][t1] = 1;
        }
        dfs(1); // 1번부터 탐색 시작   
    }
}

