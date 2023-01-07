package 정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class NumSort2 {

	//시간고려
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		// Arrays.sort >> O(N^2)
//		int[] arr = new int[n];
//		for(int i = 0; i < n; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//		}
//		Arrays.sort(arr);
		
		// Timsort - Collections.sort >> O(n) ~ O(nlogn)
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);
		br.close();
		
		for(int i = 0; i < n; i++) {
			sb.append(list.get(i)).append("\n");
		}
		
		System.out.println(sb);
	}

}
