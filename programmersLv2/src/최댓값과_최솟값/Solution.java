package ÃÖ´ñ°ª°ú_ÃÖ¼Ú°ª;

import java.util.Arrays;

public class Solution {
	
	void solution(String s) {
		String[] arr = s.split(" ");
		
		int min = Integer.parseInt(arr[0]);
		int max = Integer.parseInt(arr[0]);
		for(int i = 0; i < arr.length; i++) {
			min = Math.min(min, Integer.parseInt(arr[i]));
			max = Math.max(max, Integer.parseInt(arr[i]));
		}
		
		System.out.println(min + " " +max);
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		
		Solution s = new Solution();
		s.solution("-1 -2 -3 -4");
		
	}

}
