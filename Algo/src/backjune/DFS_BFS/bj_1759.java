package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class bj_1759 {
    static char[] alph;
    static boolean[] visited;
    static int l;
    static int c;
    static StringBuilder st;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str =br.readLine().split(" ");
        l = Integer.parseInt(str[0]);
        c = Integer.parseInt(str[1]);
        visited = new boolean[26];
        alph = new char[c];

        String s = br.readLine().trim();
        s = s.replaceAll(" ","");
        alph = s.toCharArray();
        st = new StringBuilder();
        Arrays.sort(alph);
        backtrack(alph,"",visited,0,0);

        System.out.println(st);
        br.close();

    }
    private static boolean chked(String pw){
        char[] ch = pw.toCharArray();
        int mo = 0;
        int za = 0;

        for(int i=0; i<ch.length; i++){
            char a = ch[i];
            if(a == 'i' || a=='a' || a=='e' || a=='o' || a=='u') mo++;
            else za++;
        }
        if(mo>0 && za>1) return true;
        else return false;
    }

    private static void backtrack(char[] alph, String pw, boolean[] visited, int pos, int len){
        //자음 모음 갯수 확인
        // 암호문 길이 확인
        if(len==l){
            if(chked(pw)) st.append(pw +"\n");
            return;
        }

        if(pos>=alph.length){
            return;
        }
        int num = alph[pos] - 'a';
        //visited[num] = true;


        if(len>=l || pos>=alph.length){
            return;
        }

        for(int i=pos; i<alph.length; i++){
            int tmp = alph[i] -'a';
            if(!visited[tmp]){
                visited[tmp] = true;
                backtrack(alph,pw+alph[i],visited,i+1,pw.length()+1);
                visited[tmp] = false;
            }
        }

        return;

    }
}