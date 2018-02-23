package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//불
public class ex_4179 {
	static int R;
	static int C;
	static String[][] ad;
	static fire2 jeehune;
	static int result =0;
	static boolean firecheck = false; //불이 없을 경우 확인
	static ArrayList<fire2> arr; //불 위치 확인
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder st = new StringBuilder();
			String[] sp = br.readLine().split(" ");
			R = Integer.parseInt(sp[0]);
			C = Integer.parseInt(sp[1]);
			ad = new String[R][C];
			arr = new ArrayList<>();
			int JeehuneX = 0;
			int JeehuneY = 0;
			for(int i=0; i<R; i++){
				String str = br.readLine();
				for(int j=0; j<C; j++){
					ad[i][j] = String.valueOf(str.charAt(j));
					//상근이 위치 받기
					if(ad[i][j].equals("J")){
						JeehuneX = i;
						JeehuneY = j;
					}else if(ad[i][j].equals("F")){
						//불 위치 받기 
						firecheck = true;
						arr.add(new fire2(i,j,0));
					}
				}
			}
			bfs(JeehuneX, JeehuneY);
			//상근이가 탈출했다면 횟수 출력
			if(result==1) st.append(jeehune.check);
			// 못했다면 IMPOSSIBLE 출력
			else st.append("IMPOSSIBLE");
			st.append("\n");
		
		System.out.println(st);

		br.close();
		
	}
	
	static private void bfs(int x, int y){
		Queue<fire2> q = new LinkedList();
		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		
		//불 먼저 넣음
		if(firecheck==true){
			for(int i=0; i<arr.size(); i++){
				q.offer(new fire2(arr.get(i).x,arr.get(i).y,0));
			}
		}
		// 상근이 위치 넣음
		q.offer(new fire2(x,y,1));
		while(!q.isEmpty()){
			jeehune = q.poll();
			// 상근이가 도착한 경우 && 도착한게 불이 아닌 경우
			if((jeehune.x==0 ||jeehune.x==R-1 || jeehune.y==0 || jeehune.y==C-1) && jeehune.check>0){
					result = 1;
					break;
			}
			//이동하면 이동하기 전자리 벽으로 만듬. 다시 못가게
			ad[jeehune.x][jeehune.y] = "#";
			for(int i=0; i<4; i++){
				int moveX = jeehune.x + dx[i];
				int moveY = jeehune.y + dy[i];
				
				if(moveX>=0 && moveX<R && moveY>=0 && moveY<C){
					if(ad[moveX][moveY].equals(".")){
						//fire 이동
						if(jeehune.check==0){
							ad[moveX][moveY] = "F";
							q.offer(new fire2(moveX, moveY,0));
						}else{ //jeehune 이동
							ad[moveX][moveY] = "J";
							q.offer(new fire2(moveX, moveY,jeehune.check+1));
						}
					}
				}
			}
		}
	}
}

final class fire2{
	int x;
	int y;
	int check; // 불인지 상근인지 확인 불:0 상근:1로 시작
	
	fire2(int x, int y, int check){
		this.x = x;
		this.y = y;
		this.check = check;
	}
}


