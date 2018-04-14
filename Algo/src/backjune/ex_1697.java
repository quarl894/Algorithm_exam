package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//숨바꼭질
public class ex_1697 {
	static int[] ad;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int N = Integer.parseInt(sp[0]); //수빈이 위치
		int K = Integer.parseInt(sp[1]); //동생 위치

        ad = new int[100001];
        Arrays.fill(ad, -1);    //초기값을 다 -1로 설정
        System.out.println(BFS(N, K));
 
    }
 
    public static int BFS(int N, int K) {
        int nextN = N;
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(nextN);
        ad[nextN] = 0;
 
        while(!q.isEmpty() && nextN != K) {
            nextN = q.poll();
            int[] xy = {nextN-1, nextN+1, nextN*2};
 
            for (int i=0; i<3; i++) {
                if (xy[i] >= 0 && xy[i] <= 100000) {
                    if (ad[xy[i]] == -1) {
                        q.offer(xy[i]);
                        ad[xy[i]] = ad[nextN] + 1;
                    }
                }
            }
        }
        return ad[K];
    }
}
