package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//집합
//비트마스크로 풀기
public class ex_11723_2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int S = 0;
		int num = 0;
		StringBuilder st = new StringBuilder();
		for(int i=0; i<M; i++){
			StringTokenizer stk = new StringTokenizer(br.readLine());
			String str = stk.nextToken();
			if(stk.hasMoreTokens()) num = Integer.parseInt(stk.nextToken());
			switch(str){
			case "add":
				S |=(1<<num);
				break;
			case "remove":
				S &= (~(1<<num));
				break;
			case "check":
				if((S&(1<<num))!=0) st.append(1+"\n");
				else st.append(0+"\n");
				break;
			case "toggle":
                if (((1 << num) & S) == 0) S |= (1 << num);
                else S &= (~(1<<num));
				break;
			case "all":
				S |= (1<<21) -1;
				break;
			case "empty":
				S=0;
				break;
			}
		}
		System.out.println(st);
		br.close();
	}

}
