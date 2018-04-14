package backjune;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * BOJ#11066 Merging Files
 * https://www.acmicpc.net/problem/11066
 */

public class ex_11066{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
        	int K = Integer.parseInt(br.readLine());
        	 LinkedList<Integer> list = new LinkedList<>();
        	 StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        	for(int j=0; j<K; j++){
        		list.add(Integer.parseInt(stk.nextToken()));
        	}
        	int min = Integer.MAX_VALUE;
        	int count = 0;
        	int result = 0;
        	while(list.size()!=1){
            	for(int k=0; k<list.size()-1; k++){
            		if(min>list.get(k)+list.get(k+1)){
            			min = list.get(k)+list.get(k+1);
            			count = k;
            		}
            	}
            	System.out.println("num:"+min);
            	list.remove(count);
            	list.remove(count);
            	list.add(count, min);
            	result +=min;
        	}
        	System.out.println(result);
        }
    }
}