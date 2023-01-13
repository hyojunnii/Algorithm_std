package 기하1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MelonField {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int k = Integer.parseInt(br.readLine()); //1m2당 참외개수
		
		int[][] arr = new int[5][2];
		for(int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			int dir = Integer.parseInt(st.nextToken()); //방향 1동 2서 3남 4북
			int len = Integer.parseInt(st.nextToken()); //길이
			
			if(arr[dir][0] == 0) {
				arr[dir][0] = len;
			} else {
				arr[dir][1] = len;
			}
			
		}
		System.out.println(Arrays.deepToString(arr));
		
		if(arr[1][1] != 0) {
			
		}

	}

}
