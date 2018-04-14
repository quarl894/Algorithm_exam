package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

//�ٸ�����
//mCn = m! / {(m-n)! * n!} M���� N���� �����ϴ� ����� ��
public class ex_1010 {
	public static void main(String[] args) throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int T = Integer.parseInt(br.readLine());
		 StringBuilder stk = new StringBuilder();
		 for(int k=0; k<T; k++){
			 StringTokenizer st = new StringTokenizer(br.readLine());
	         int N = Integer.parseInt(st.nextToken());
	         int M = Integer.parseInt(st.nextToken());
	         if (N == M) {
	        	 stk.append(1);
	        	 stk.append("\n");
	        	 continue;
	            }
	         // long�� �ʰ��ؼ� BigInteger��
	         BigInteger num = new BigInteger("1");
	         // m! /(m-n)!
	         for (int i= M; i> M-N; i--) {
	             num = num.multiply(BigInteger.valueOf(i));
	         }
	         // /n!
	         for (int i=1; i<=N; i++) {
	             num = num.divide(BigInteger.valueOf(i));
	         }
	         stk.append(num);
	         stk.append("\n");
	         }
		 System.out.println(stk);
		 br.close();
		 }
}
