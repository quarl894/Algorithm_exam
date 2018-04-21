package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class beakjoon_1406_2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> stk_1 = new Stack<>();
        Stack<Character> stk_2 = new Stack<>();

        for(int i=0; i<str.length(); i++){
            stk_1.push(str.charAt(i));
        }
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            switch (stk.nextToken()) {
                case "L":
                    if (!stk_1.isEmpty()) stk_2.push(stk_1.pop());
                    break;
                case "D":
                    if (!stk_2.isEmpty()) stk_1.push(stk_2.pop());
                    break;
                case "B":
                    if (!stk_1.isEmpty()) stk_1.pop();
                    break;
                case "P":
                    stk_1.push(stk.nextToken().charAt(0));
                    break;
            }
        }
        StringBuilder st = new StringBuilder();
        while(!stk_1.isEmpty()) st.append(stk_1.pop());
        st.reverse();
        while(!stk_2.isEmpty()) st.append(stk_2.pop());
        System.out.println(st.toString());

        br.close();

    }
}
