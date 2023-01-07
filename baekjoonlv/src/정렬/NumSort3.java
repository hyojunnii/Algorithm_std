package 정렬;

import java.io.*;
//import java.util.*;

public class NumSort3 {

	//시간+메모리고려
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		// Counting Sort
		int[] count = new int[10001];
		for(int i = 0; i < n; i++) {
			count[Integer.parseInt(br.readLine())]++;
		}
		br.close();
		
		for(int i = 1; i < 10001; i++) {
			while(count[i] > 0) {
				sb.append(i).append("\n");
				count[i]--;
			}
		}
		
		//Collections.sort는 메모리초과
		//Arrays.sort는 시간 간당간당
//		int[] arr = new int[n];
//		for(int i = 0; i < n; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//		}
//		Arrays.sort(arr);

//		for(int i = 0; i < n; i++) {
//			sb.append(arr[i]).append("\n");
//		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
		
	}

}
