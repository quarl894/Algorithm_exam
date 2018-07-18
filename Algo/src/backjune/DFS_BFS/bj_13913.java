package backjune.DFS_BFS;

import java.util.*;

public class bj_13913{
    static int[] check;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        check = new int[100001];
        Arrays.fill(check,-1);

        if(N!=K) bfs(N,K);
        else{
            System.out.println(0);
            System.out.println(N);
        }
        sc.close();
    }

    private static void bfs(int N, int K){
        Queue<xy> q = new LinkedList<>();
        ArrayList<xy> ans = new ArrayList<>();
        q.offer(new xy(N,5,0));
        int nextN = N;
        int depth =0;
        Loop1 : while(!q.isEmpty()) {
            nextN = q.peek().getX();
            depth = q.poll().getDepth();
            int[] arr = {nextN - 1, nextN + 1, nextN * 2};
            for (int i = 0; i < 3; i++) {
                if(arr[i]==K){
                    ans.add(new xy(nextN, arr[i]));
                    break Loop1;
                }
                if (arr[i] >= 0 && arr[i] <= 100000) {
                    if(check[arr[i]]==-1) {
                        check[arr[i]] = 0;
                        q.offer(new xy(arr[i], nextN, depth + 1));
                        ans.add(new xy(nextN, arr[i]));
                    }
                }
            }
        }

        int len = ans.size();
        int element = K;
        ArrayList<Integer> result = new ArrayList<>();
        result.add(element);
        //System.out.println("count: " + ans.get(39).getY());

        while(len-->0 && element!=N){
            if(ans.get(len).getY() == element){
                result.add(element);
                element = ans.get(len).getX();
            }
          //  System.out.println(ans.get(len).x + ", " + ans.get(len).y);
        }
        result.add(N);
        StringBuilder st = new StringBuilder();
        st.append(depth+1 + "\n");

        int count = result.size();
        while(--count>0){
            st.append(result.get(count) +" ");
        }
        System.out.println(st.toString());
    }

}

class xy{
    int x,y,depth;

    public xy(int x, int y, int depth) {
        this.x = x;
        this.y = y;
        this.depth = depth;
    }

    public xy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDepth() {
        return depth;
    }
}

