package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
/*
하 단순히 백트래킹이지만 왜케 구현하기가 어렵냐....
이번주에 다시 복습하기...
 */

public class bj_3671_2 {
    static HashSet<Integer> set;
    static int answer;
    static boolean[] visited;
    static boolean[] prime;
    static char[] numbers;
    static int len;
    static int MAX = 10000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Eratos();

        while(n-->0){
            numbers = br.readLine().toCharArray();
            len = numbers.length;
            answer = 0;
            set = new HashSet<>();
            visited = new boolean[len];
            for(int i=0; i<len; i++) {
                    StringBuffer sb = new StringBuffer();;
                    sb.append(numbers[i]);
                    visited[i] = true;
                    backtracking(sb.toString());
                    visited[i] = false;
            }
            System.out.println(answer);
        }
        br.close();
    }

    private static void backtracking(String number){
        int num = Integer.parseInt(number);
        if(!set.contains(num) && isPrime(num)) {
            set.add(num);
            answer++;
        }

        for(int i=0; i<len; i++) {
            if(!visited[i]) {
                StringBuffer sb = new StringBuffer();
                sb.append(number);
                sb.append(numbers[i]);
                visited[i] = true;
                backtracking(sb.toString());
                visited[i] = false;
            }
        }

    }
    static private boolean isPrime(int num) {
        if(num<=1) return false;
        if(prime[num]) {
            return true;
        } else {
            return false;
        }
    }

    static private void Eratos() {
        prime = new boolean[MAX+1];
        prime[0] = false;
        prime[1] = false;

        for(int i=2; i<=MAX; i++) {
            prime[i] = true;
        }
        for(int i=2; i<=MAX; i++) {
            for(int j=i*2; j<=MAX; j+=i) {
                if(prime[i]) {
                    prime[j] = false;
                }
            }
        }
    }
}
