package backjune.simsim;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj_11866 {
    static int N,M;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        System.out.println(circle(N,M));

        sc.close();

    }

    private static String circle(int n, int m){
        n = N;
        m = M;
        Queue<Integer> q = new LinkedList<>();
        StringBuilder st = new StringBuilder();
        st.append("<");

        for(int i=1; i<=N; i++){
            q.offer(i);
        }

        while(!q.isEmpty()){
            for(int i=0; i<m; i++){
                q.offer(((LinkedList<Integer>) q).pop());
            }
            st.append(((LinkedList<Integer>) q).pollLast() +", ");
        }

        st.delete(st.length()-2, st.length());
        st.append(">");

        return st.toString();
    }
}
