package 정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class CoordinatesSort {

	//좌표정렬 - x > y
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		//람다식 사용한 2차원배열 정렬
		Arrays.sort(arr, (e1, e2) -> {
			//첫번째 원소가 같다면 두 번째 원소끼리 비교
			if(e1[0] == e2[0]) { 
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		
		//람다식 없이 Comparator 사용
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
			}
		});

		//반복문 정렬 - 시간초과
//		int temp = 0;
//		int temp2 = 0;
//		for(int i = 0; i < arr.length-1; i++) {
//			for(int j = 0; j < arr.length-1-i; j++) {
//				if(arr[j][0] > arr[j+1][0] || (arr[j][0] == arr[j+1][0] && arr[j][1] > arr[j+1][1])) {
//					temp = arr[j][0];
//					temp2 = arr[j][1];
//					arr[j][0] = arr[j+1][0];
//					arr[j][1] = arr[j+1][1];
//					arr[j+1][0] = temp; 
//					arr[j+1][1] = temp2;
//				}
//			}
//		}
		
		for(int i = 0; i < n; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
		}
		
		System.out.println(sb);
	}

}
