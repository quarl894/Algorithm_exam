package backjune;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class beakjoon_11655 {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        String str = br.readLine();

        for(int i=0; i<str.length(); i++){
            int tmp = str.charAt(i);
            if(tmp>=97 && tmp<=122){
                tmp +=13;
                if(tmp>122) tmp -=26;
                st.append((char)(tmp));
            }else if(tmp>=65 && tmp<=90){
                tmp +=13;
                if(tmp>90) tmp -=26;
                st.append((char)(tmp));
            }else{
                st.append(str.charAt(i));
            }
        }
        System.out.println(st.toString());
        br.close();
    }
}
