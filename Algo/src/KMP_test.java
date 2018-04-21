import java.util.*;
import java.io.*;
import java.math.*;
 
public class KMP_test{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    static int n, m, L, cnt = 0;
    static int[] pi;
    static char[] str, ptn;
    
    public static void main(String args[]) throws IOException{
    	n = Integer.parseInt(br.readLine());
    	L = Integer.parseInt(br.readLine());
    	str = br.readLine().toCharArray();
    	m = 2*n+1;
    	ptn = new char[m];
    	for(int i = 0; i < m; i++) ptn[i] = (i%2==0) ? 'I' : 'O';
    	kmp();
    	bw.write(cnt+"");
        bw.close();
    }
    
    static void kmp(){
    	makePi();
    	for(int i = 0, j = 0; i < L; i++){
    		while(j > 0 && str[i] != ptn[j]) j = pi[j-1];
    		if(str[i] == ptn[j]){
    			if(j == m-1){
    				cnt++;
    				j = pi[j];
    			}else j++;
    		}
    	}
    }
    
    //패턴 접미사 접두사 확인하기
    static void makePi(){
    	pi = new int[m];
    	for(int i = 1, j = 0; i < m; i++){
    		while(j > 0 && ptn[i] != ptn[j]) j = pi[j-1];
    		if(ptn[i] == ptn[j]) pi[i] = ++j;
    	}
    }
}