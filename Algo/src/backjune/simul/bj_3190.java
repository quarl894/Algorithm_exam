package backjune.simul;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/*
뱀 이동할 때 번호 매기면서 이동함.
꼬리는 따로 저장해서 사과가 없을 때 꼬리를 갱신해줌.(다음 번호가 꼬리가 되도록 꼬리 찾아서 갱신)
 */
public class bj_3190 {
    static int[][] map;
    static int[][] visited;
    static HashMap<Integer,String> chk = new HashMap<>();
    static xy tail = new xy(1,1);
    static int result;
    static snake tmp;
    static int ans = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        result = n;
        map = new int[n+2][n+2]; // 벽도 함께 설계
        visited = new int[n+2][n+2];
        while(k-->0){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());
            map[a][b] = 1;
        }
        int L = Integer.parseInt(br.readLine());

        while(L-->0){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stk.nextToken());
            String b = stk.nextToken();
            chk.put(a,b);
        }

        move();
    }

    private static void move(){
        Queue<snake> q = new LinkedList<>();
        tmp = new snake(1,1,0,1);
        q.offer(new snake(1,1,0,1));

        // 예외처리 해야함
        visited[1][1] = 0;
        while(!q.isEmpty()) {
            snake s = q.poll();
           // int ans = s.cnt+1;

            if (!chk.containsKey(s.cnt)) {
                // 방향이 안나왔을시
                if (s.d == 1) {
                    tmp = new snake(s.x, s.y+1, s.cnt, s.d);
                } else if (s.d == 2) {
                    tmp = new snake(s.x+1, s.y, s.cnt, s.d);
                } else if (s.d == 3) {
                    tmp = new snake(s.x, s.y-1, s.cnt, s.d);
                } else if (s.d == 4) {
                    tmp = new snake(s.x-1, s.y, s.cnt, s.d);
                }
            }else{
                if(chk.get(s.cnt).equals("L")){
                    if (s.d == 1) {
                        tmp = new snake(s.x-1, s.y, s.cnt, 4);
                    } else if (s.d == 2) {
                        tmp = new snake(s.x, s.y+1, s.cnt, 1);
                    } else if (s.d == 3) {
                        tmp = new snake(s.x+1, s.y, s.cnt, 2);
                    } else if (s.d == 4) {
                        tmp = new snake(s.x, s.y-1, s.cnt, 3);
                    }
                }else{
                    if (s.d == 1) {
                        tmp = new snake(s.x +1, s.y, s.cnt, 2);
                    } else if (s.d == 2) {
                        tmp = new snake(s.x, s.y-1, s.cnt, 3);
                    } else if (s.d == 3) {
                        tmp = new snake(s.x-1, s.y, s.cnt, 4);
                    } else if (s.d == 4) {
                        tmp = new snake(s.x, s.y+1, s.cnt, 1);
                    }
                }
                chk.remove(s.cnt);
            }
            ans = tmp.cnt+1;
            // 사과가 있을 경우, 없을 경우
            if(tmp.x>0 && tmp.x<=result && tmp.y>0 && tmp.y<=result && visited[tmp.x][tmp.y]==0){
                if(map[tmp.x][tmp.y]==0){
                    visited[tmp.x][tmp.y] = ans;
                    find_t(tail);
                    q.offer(new snake(tmp.x,tmp.y,ans, tmp.d));
                }else{
                    map[tmp.x][tmp.y] = 0;
                    visited[tmp.x][tmp.y] = ans;
                    q.offer(new snake(tmp.x,tmp.y,ans, tmp.d));
            }
            }else{
                System.out.println(ans);
                return;
            }
        }
        System.out.println(ans);
        return;
    }
    private static void find_t(xy t){
        int[] ay = {1,0,-1,0};
        int[] ax = {0,-1,0,1};
        for(int i=0; i<4; i++){
            int dx = t.x +ax[i];
            int dy = t.y +ay[i];
            if(dx>0 && tmp.x<=result && dy>0 && dy<=result) {
                if (visited[dx][dy] == visited[t.x][t.y] + 1) {
                    tail = new xy(dx, dy);
                    visited[t.x][t.y] = 0;
                    return;
                }
            }
        }
    }

    private static class snake{
        int x;
        int y;
        int cnt;
        int d;

        public snake(int x, int y, int cnt, int d) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.d = d;
        }
    }

    private static class xy{
        int x;
        int y ;

        public xy(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
