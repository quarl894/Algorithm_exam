package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
// 합이 0인 네 정수
public class ex_7453 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] a = new long[N];
		long[] b = new long[N];
		long[] c = new long[N];
		long[] d = new long[N];
		
		for(int i=0; i<N; i++){
			String[] sp = br.readLine().split(" ");
			a[i] = Long.parseLong(sp[0]);
			b[i] = Long.parseLong(sp[1]);
			c[i] = Long.parseLong(sp[2]);
			d[i] = Long.parseLong(sp[3]);
		}
		long[] ab = new long[N*N];		
		long[] cd = new long[N*N];
		int num = 0;
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				ab[num] = a[i] +b[j];
				cd[num] = c[i] + d[j];
				num++;
			}
		}
		int count =0;
		for(int i=0; i<N*N; i++){
			for(int j=0; j<N*N; j++){
				long result = ab[i]+cd[j];
				if(result==0){
					count++;
				}
			}
		}
		System.out.println(count);
		br.close();
	}

}
