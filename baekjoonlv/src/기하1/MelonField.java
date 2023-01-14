package 기하1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//참외밭 - 특정 도형 넓이
public class MelonField {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int k = Integer.parseInt(br.readLine()); //1m2당 참외개수
		
		int[][] arr = new int[6][2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			int dir = Integer.parseInt(st.nextToken()); //방향 1동 2서 3남 4북
			int len = Integer.parseInt(st.nextToken()); //길이
			
			arr[i][0] = dir;
			arr[i][1] = len;
			
			map.put(dir, len);
		}
		
		int X = Math.max(map.get(1), map.get(2)); //긴 가로
		int Y = Math.max(map.get(3), map.get(4)); //긴 세로
		
		int area = X*Y;
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < 6; i++) {
			if(arr[i][1] == X) {
				if(i == 0) {
					x = Math.abs(arr[i+1][1] - arr[5][1]);
				} else if (i == 5) {
					x = Math.abs(arr[i-1][1] - arr[0][1]);
				} else {
					x = Math.abs(arr[i-1][1] - arr[i+1][1]);
				}
			}
			if(arr[i][1] == Y) {
				if(i == 0) {
					y = Math.abs(arr[i+1][1] - arr[5][1]);
				} else if (i == 5) {
					y = Math.abs(arr[i-1][1] - arr[0][1]);
				} else {
					y = Math.abs(arr[i-1][1] - arr[i+1][1]);
				}
			}
		}
		area -= x*y;
		
		System.out.println(area * k);
		br.close();
	}

}
