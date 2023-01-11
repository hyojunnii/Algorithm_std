package 브루트_포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//덩치 등수 매기기
public class Figure {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
				
		StringTokenizer st;
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken()); //몸무게
			arr[i][1] = Integer.parseInt(st.nextToken()); //키
		}
		
		//각각 등수 구하기
		for(int i = 0; i < n; i++) {
			int rank = 1;
			
			for(int j = 0; j < n; j++) {
				if(i == j) continue;
				
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
			
			System.out.print(rank + " ");
		}

	}

}
