package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class beakjoon_1406 {
    static LinkedList<Character> arr= new LinkedList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] tmp = br.readLine().toCharArray();
        for(char c : tmp){
            arr.add(c);
        }
        int N = Integer.parseInt(br.readLine());

        ListIterator iterator = arr.listIterator(arr.size());

        for(int i=0; i<N; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            switch(stk.nextToken()) {
                case "L":
                    if(iterator.hasPrevious()) iterator.previous();
                    break;
                case "D":
                    if(iterator.hasNext()) iterator.next();
                    break;
                case "B":
                    if (iterator.hasPrevious()){
                        iterator.previous();
                        iterator.remove();
                    }
                    break;
                case "P":
                    iterator.add(stk.nextToken().charAt(0));
                    break;
            }
        }
        StringBuilder st = new StringBuilder();
        for(char c : arr){
            st.append(c);
        }
        System.out.println(st.toString());
        br.close();
    }
}
