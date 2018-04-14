package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

//오르막수
public class ex_11057 {
	static int N;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		BigInteger arr[] = new BigInteger[11];
		arr[10]= BigInteger.ZERO;
		for(int i=0; i<10; i++){
			arr[i] = BigInteger.ONE;
			arr[10] = arr[10].add(arr[i]);
		}
		result(arr);
		BigInteger m = new BigInteger("10007");
		System.out.println(arr[10].mod(m));
		br.close();
	}
	
	private static BigInteger[] result(BigInteger[] arr){
		if(N<=1) return arr;
		else{
			BigInteger temp[] =Arrays.copyOf(arr, arr.length);
			arr[0] = arr[10];
			for(int i=1; i<10; i++){
				arr[i] = arr[i-1].subtract(temp[i-1]);
				arr[10] = arr[10].add(arr[i]);
			}
			N--;
			return result(arr);
		}
	}
}

