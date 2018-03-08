package backjune;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//IOIOI
public class ex_5525{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringBuilder st = new StringBuilder();
		st.append("IOI");
		for(int i=1; i<N; i++){
			st.append("OI");
		}
		KMP a = new KMP();
		System.out.println(a.kmp(str, st.toString()).size());
		
		br.close();
	}
	
	//KMP 알고리즘
	static public class KMP {
	    int[] getPi(String p){
	        int n = p.length();
	        int j=0;
	        int[] pi = new int[n];
	        for(int i=1; i<n; i++){
	            while(j > 0 && p.charAt(i) != p.charAt(j)) j = pi[j-1];
	            if(p.charAt(i) == p.charAt(j)) pi[i] = ++j;
	        }
	        return pi;
	    }
	    
	    ArrayList<Integer> kmp(String s, String p){
	        ArrayList<Integer> ret = new ArrayList<>();
	        int[] pi = getPi(p);
	        int n = s.length();
	        int m = p.length();
	        int j = 0;
	        for(int i=0; i<n; i++){
	            while(j>0 && s.charAt(i) != p.charAt(j)) j = pi[j-1];
	            if(s.charAt(i) == p.charAt(j)){
	                if(j == m-1){
	                    ret.add(i-m+1);
	                    j = pi[j];
	                }else{
	                    j++;
	                }
	            }
	        }
	        return ret;
	    }
	}
}

