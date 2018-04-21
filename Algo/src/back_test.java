import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class back_test {
	static boolean[] visited = new boolean[10];
	static int[] numbers = new int[11];
	static int[] op = new int[10];
	static int n, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
	 
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    n = Integer.parseInt(br.readLine());
	    int idx = 0;
	    StringTokenizer stk = new StringTokenizer(br.readLine());
	    for (int i = 0; i < n; i++) {
	        numbers[i] = Integer.parseInt(stk.nextToken());
	    }
	 
	    StringTokenizer stk2 = new StringTokenizer(br.readLine());
	    for (int i = 0; i < 4; i++) {
	        int cnt = Integer.parseInt(stk2.nextToken());
	        for (int j = 0; j < cnt; j++) {
	            op[idx++] = i + 1;
	        }
	    }
	 
	    dfs(0, 1, numbers[0], 0);
	    System.out.println(max);
	    System.out.println(min);
	    br.close();
	}
	 
	public static void dfs(int v, int idx, int num, int len) {
	    int result = 0;
	 
	    if (len == n - 1) {
	        if (num > max) {
	            max = num;
	        }
	        if (num < min) {
	            min = num;
	        }
	    } else {
	        for (int i = 0; i < n - 1; i++) {
	            if (!visited[i]) {
	                switch (op[i]) {
	                    case 1:
	                        result = num + numbers[idx];
	                        break;
	                    case 2:
	                        result = num - numbers[idx];
	                        break;
	                    case 3:
	                        result = num * numbers[idx];
	                        break;
	                    case 4:
	                        result = num / numbers[idx];
	                        break;
	                }
	                visited[i] = true;
	                dfs(i, idx + 1, result, len + 1);
	            }
	        }
	    }
	    // backtracking
	    visited[v] = false;
	}
}