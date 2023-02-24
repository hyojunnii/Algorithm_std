package 문자열_내_마음대로_정렬하기;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	
	public static String[] solution(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				//순서바꿈 - 내림차순
				if(o1.charAt(n) < o2.charAt(n)) {
					return -1;
				} 
				//같으면 사전순
				else if(o1.charAt(n) == o2.charAt(n)) {
					return o1.compareTo(o2);
				}
				//순서바꾸지않음 - 오름차순
				return 1;
			}
		});
		return strings;
	}

	public static void main(String[] args) {
		String[] arr = {"abce", "abcd", "cdx"};
	 	System.out.println(Arrays.toString(solution(arr, 2)));
	 	
	 	//System.out.println(Arrays.toString(solution(new String[]{"abce", "abde", "cdx"}, 1)));
	}

}
