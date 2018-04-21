package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class beakjoon_10799 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        Stack<Character> stk = new Stack<>();
        int result = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == '(') stk.push(arr[i]);
            else{
                stk.pop();
                if(arr[i-1]=='(') result += stk.size();
                else result +=1;
            }
        }
        System.out.println(result);
        br.close();
    }
}
