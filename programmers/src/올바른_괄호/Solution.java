package ¿Ã¹Ù¸¥_°ýÈ£;

import java.util.Arrays;

public class Solution {
	
	void solution(String s) {
		
		String[] arr = s.split(")");
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		
		Solution s = new Solution();
		s.solution("()()");
		
	}

}
