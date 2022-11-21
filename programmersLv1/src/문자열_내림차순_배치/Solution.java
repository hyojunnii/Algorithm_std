package 문자열_내림차순_배치;

import java.util.Arrays;

public class Solution {
	
	String solution(String s) {
		char[] strarr = s.toCharArray();
		
		char temp;
		for(int j = 0; j < strarr.length-1; j++) {
			for(int i = 0; i < strarr.length-1; i++) {
				if(strarr[i] < strarr[i+1]) {
					temp = strarr[i];
					strarr[i] = strarr[i+1];
					strarr[i+1] = temp;
				}
			}
		}
		
		String answer = new String(strarr);
		System.out.println(answer);
		return answer;
	}
	
	// Arrays.sort && StringBuilder.reverse
	String reverseStr(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		
		String answer = new StringBuilder(new String(arr)).reverse().toString();
		
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		//solution.solution("Zbcdefg");
		solution.reverseStr("Zbcdefg");
	}

}
