package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//톱니바퀴
public class ex_14891 {
	static int[][] wh;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		wh = new int[4][8];
		for(int i=0; i<4; i++){
			String str = br.readLine();
			for(int j=0; j<8; j++){
				wh[i][j] = Integer.valueOf(str.charAt(j))-48;
			}
		}

		//돌기전 다른 극인지 확인하고 다르면 돌아야됨(단, 인접바퀴가 회전 할 경우 && 다른 극일경우) 입력받은 바퀴는 무조건 돌아감.
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++){
			String[] sp = br.readLine().split(" ");
			int num = Integer.parseInt(sp[0]);
			int direct = Integer.parseInt(sp[1]);
			boolean a,b,c;
			a = (wh[0][2]==wh[1][6]);
			b = (wh[1][2]==wh[2][6]);
			c = (wh[2][2]==wh[3][6]);
			rotate(num-1,direct);
			switch(num){
			case 1 :
				if(a==true) break;
				else{
					rotate(1,direct*-1);
					if(b==false){
						rotate(2,direct);
						if(c==false) rotate(3,direct*-1);
					}
				}
				break;
			case 2 :
				if(a==false) rotate(0,direct*-1);
				if(b==true) break;
				else{
					rotate(2,direct*-1);
					if(c==false) rotate(3,direct);
				}
				break;
			case 3 :
				if(c==false) rotate(3,direct*-1);
				if(b==true) break;
				else{
					rotate(1,direct*-1);
					if(a==false) rotate(0,direct);
				}
				break;
			case 4 :
				if(c==true) break;
				else{
					rotate(2,direct*-1);
					if(b==true) break;
					else{
						rotate(1,direct);
						if(a==false) rotate(0,direct*-1);
					}
				}
				break;
			}
		}
		int sum =0;
		if(wh[0][0]==1) sum+=1;
		if(wh[1][0]==1) sum+=2;
		if(wh[2][0]==1) sum+=4;
		if(wh[3][0]==1) sum+=8;
		System.out.println(sum);
		br.close();
	}
	
	static private void rotate(int num, int direct){
		if(direct==1){
			int temp = wh[num][7];
			for(int i=7; i>0; i--){
				wh[num][i] = wh[num][i-1];
			}
			wh[num][0] =temp;
		}else if(direct==-1){
			int temp = wh[num][0];
			for(int i=0; i<7; i++){
				wh[num][i] = wh[num][i+1];
			}
			wh[num][7] =temp;
		}
	}
}
