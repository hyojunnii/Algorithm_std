package 정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class CoordinatesCompression {
	
	//좌표 압축
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		String[] origin = br.readLine().split(" ");
		br.close();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(origin[i]);
		}
		Arrays.sort(arr);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int rank = 0;
		for(int i = 0; i < n; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], rank);
				rank++;
			}
		}
		
		for(String s : origin) {
			sb.append(map.get(Integer.parseInt(s))).append(" ");
		}
		
		System.out.println(sb);
	}

}
