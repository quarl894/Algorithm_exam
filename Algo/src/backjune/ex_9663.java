package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//N-Queen
public class ex_9663 {
	static int path[] = new int[16];
	static int n;
	static int ans;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.valueOf(br.readLine());
		
		for(int i=0; i<n; i++){
			path[0] = i;
			nQueen(i,0);
		}
		System.out.println(ans);
		br.close();
	}
	private static void nQueen(int x, int y) {
		for(int i=0; i<y; i++){
	        if(path[i]==x || Math.abs(x-path[i])==y-i)
	        	 return;
	    }
	    if(y==n-1){
	        ans++;
	        return;
	    }
	    for(int i=0;i<n;i++){
	        path[y+1]=i;
	        nQueen(i,y+1);
	    }
	}
}