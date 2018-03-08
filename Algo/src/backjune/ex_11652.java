package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

//Ä«µå
public class ex_11652 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashMap<BigInteger,Integer> hash = new HashMap<>();
		ArrayList<Card> arr = new ArrayList<>();
		
		for(int i=0; i<N; i++){
			BigInteger num = BigInteger.valueOf(Long.parseLong(br.readLine()));
			if(hash.containsKey(num)){
				hash.replace(num, hash.get(num)+1);
				arr.add(new Card(num,hash.get(num)));
			}else{
				hash.put(num, 1);
				arr.add(new Card(num,1));
			}
		}
		Collections.sort(arr, new Comparator<Card>(){
			@Override
			public int compare(Card o1, Card o2){
				if(o1.count>o2.count){
					return 1;
				}else if(o1.count<o2.count){
					return -1;
				}
				else{
					if ( o1.num.compareTo(o2.num)==-1 ){
						return 1;
	                }
	                else if (o1.num.compareTo(o2.num)==1){
	                    return -1;
	                }
	                else {
	                    return 0;
	                }
				}
			}
		});
		System.out.println(arr.get(0).getnum());
		br.close();
		
	}
}
final class Card{
	BigInteger num;
	Integer count;
	
	Card(BigInteger num, Integer count){
		this.num = num;
		this.count = count;
	}
	
	public BigInteger getnum(){
		return this.num;
	}
}
