package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//행복한지 슬픈지
public class ex_10769 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int happy = 0;
		int sad = 0;
		if(str.length()<3) System.out.println("none");
		else{
			for(int i=0; i<str.length(); i++){
				// index초과 날수 있으니 예외처리
				if(str.charAt(i)==':' && i+2<str.length()){
					String temp = String.valueOf(str.charAt(i)) +String.valueOf(str.charAt(i+1)) + String.valueOf(str.charAt(i+2));
					if(temp.equals(":-)")){
						happy +=1;
					}else if(temp.equals(":-(")){
						sad +=1;
					}else continue;

				}
			}
			if(happy>sad) System.out.println("happy");
			else if(happy<sad) System.out.println("sad");
			else if(happy==sad && (happy>=1 || sad>=1)) System.out.println("unsure");
			else if(happy==0 && sad==0) System.out.println("none");
		}
		
		br.close();
	}

}
//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Main {
//
//	public static void main(String[] args) throws IOException{
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		Pattern happy =Pattern.compile(":-\\)");
//		Pattern sad =Pattern.compile(":-\\(");
//		Matcher matcher1 = happy.matcher(str);
//		Matcher matcher2 = sad.matcher(str);
//		int h_count=0;
//		int s_count=0;	
//		while(matcher1.find()){
//			h_count++;
//		}
//		while(matcher2.find()){
//			s_count++;
//		}
//		
//		if(h_count==0 && s_count==0){
//			System.out.println("none");
//		}else if(h_count==s_count){
//			System.out.println("unsure");
//		}else if(h_count>s_count){
//			System.out.println("happy");
//		}else if(h_count<s_count){
//			System.out.println("sad");
//		}
//		
//	}
//
//}


