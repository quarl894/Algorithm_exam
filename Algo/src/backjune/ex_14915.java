package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//진수변환기
public class ex_14915 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int N = Integer.parseInt(sp[0]); //10진수 값
		int M = Integer.parseInt(sp[1]);
		if(N==0) System.out.println(0);
		else{
			StringBuilder st = new StringBuilder();
			if(M!=10){
				while(N>0){
					int num = N%M;
					if(num>=10){
						switch(num){
						case 10 : st.append('A');
						break;
						case 11 : st.append('B');
						break;
						case 12 : st.append('C');
						break;
						case 13 : st.append('D');
						break;
						case 14 : st.append('E');
						break;
						case 15 : st.append('F');
						break;
						}
					}else{
						st.append(num);
					}
					N/=M;
				}
				st.reverse();
				System.out.println(st);
			}else{
				System.out.println(N);
			}
		}
		br.close();
		
	}

}
