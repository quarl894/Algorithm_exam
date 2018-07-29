package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_2580 {
    static int[][] sudoku;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        sudoku = new int[9][9];
        for(int i=0; i<9; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                sudoku[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        dfs(0);
        print(sudoku);
        br.close();
    }

    private static void dfs(int pos){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(sudoku[i][j] == 0){
                    // 넣을 수 있는 숫자를 넣고 dfs 돌리기.
                    
                    ArrayList<Integer> arr = chked(i,j);
                    for(int k=0; k<arr.size(); k++){
                        sudoku[i][j] = arr.get(k);
                        dfs(pos+1);
                        sudoku[i][j] = 0;
                    }
                }
              //  sudoku[i][j] = 0;
            }
        }
        return;
    }

    private static ArrayList<Integer> chked(int x, int y){
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] chk = new boolean[10];
        for(int i=0; i<9; i++){
            chk[sudoku[x][i]] = true;
        }
        for(int i=0; i<9; i++){
            chk[sudoku[i][y]] = true;
        }
        for(int i=1; i<10; i++){
            if(!chk[i]) arr.add(i);
        }
        return arr;
    }

    private static void print(int[][] arr){
        StringBuilder st = new StringBuilder();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                st.append(arr[i][j]+ " ");
            }
            st.append("\n");
        }
        System.out.println(st);
    }
}
