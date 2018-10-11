package backjune.simsim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_test_1 {
    public static void main(String[] args) throws IOException {
        // comment: 집의 개수 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // comment: 비용에 대한 변수 선언 집의 개수 0 < house <= 1000
        int[][] house_color_cost = new int[1000][3];
        int[][] house_color_all_cost = new int[1000][3];

        // comment: 총 N개 만큼의 줄수 입력을 받아 비용 넣기
        for(int i=0; i<num; i++){
            // comment: Readline으로 읽어들여온 문자열을 split " "으로 처리 -> String 배열에 저장
            String[] input_cost = br.readLine().split(" ");


            // comment: 비용들 다시 생성하여 house_color_cost에 넣어주기위한 새로운 객체생성
            int[] input_cost_arr = new int[3];

            // comment: 비용들 배열에 저장
            for(int j=0; j<input_cost.length; j++){

                input_cost_arr[j] = Integer.parseInt(input_cost[j]);

            }
            // comment: 비용저장
            house_color_cost[i][0] = house_color_all_cost[i][0] = input_cost_arr[0]; // comment: 빨강
            house_color_cost[i][1] = house_color_all_cost[0][1] = input_cost_arr[1]; // comment: 초록
            house_color_cost[i][2] = house_color_all_cost[0][2] = input_cost_arr[2]; // comment: 파랑

        }


        house_color_all_cost[0][0] = house_color_cost[0][0]; // comment: 빨강 주소 참조
        house_color_all_cost[0][1] = house_color_cost[0][1]; // comment: 초록 주소 참조
        house_color_all_cost[0][2] = house_color_cost[0][2]; // comment: 파랑 주소 참조

        for(int z=1; z < num; z++){
            // comment: 3가지의 경우의 수를 따져봐야한다
            // comment: 빨 / 초 / 파 일경우를 생각하면
            // comment: 1)빨강의 경우 초, 파/초록경우 빨,파  /파랑의경우 빨 - 초 의 3가지의 경우를 따져 최소비용을 구하면 된다.

            house_color_all_cost[z][0] = Math.min(house_color_all_cost[z-1][1],house_color_all_cost[z-1][2] + house_color_cost[z][0]);
            house_color_all_cost[z][1] = Math.min(house_color_all_cost[z-1][0],house_color_all_cost[z-1][2] + house_color_cost[z][1]);
            house_color_all_cost[z][2] = Math.min(house_color_all_cost[z-1][0],house_color_all_cost[z-1][1] + house_color_cost[z][2]);


        }
        // comment: 초록과 파랑중 -> min 값구해서 다시 빨강과 비교한후 출력해준다.
        int minColorCost = Math.min(house_color_all_cost[num-1][0], Math.min(house_color_all_cost[num-1][1], house_color_all_cost[num-1][2])); // 총 세가지 페인트 중 가장 저렴한 최솟값으로 출력.
        System.out.println(minColorCost);
    }
}

