package 일차원_배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class NotSubmitted {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 1; i <= 30; i++) {
			set.add(i);
		}
		
		int num;
		for(int i = 0; i < 28; i++) {
			num = Integer.parseInt(br.readLine());
			if(set.contains(num)) {
				set.remove(num);
			}
		}
		br.close();
		
		for(int i : set) {
			System.out.println(i);
		}
		
		//boolean배열로 확인
//		boolean [] arr = new boolean[31];
//		
//		for(int i = 0; i < 28; i++) {
//			int n = Integer.parseInt(br.readLine());
//			arr[n] = true;
//		}
//		
//		for(int i = 1; i <= 30; i++) {
//			if(!arr[i]) System.out.println(i);
//		}
		
	}
}
