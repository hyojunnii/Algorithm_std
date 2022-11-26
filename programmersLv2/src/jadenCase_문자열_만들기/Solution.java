package jadenCase_문자열_만들기;

import java.util.Arrays;

public class Solution {
	
	void solution(String s) {
//		String answer = "";
//		String[] arr = s.toLowerCase().split(" ");
//		
//		System.out.println(Arrays.toString(arr));
//		
//		for(String str : arr) {
//			if("".equals(str)) {
//				answer += " ";
//				continue;
//			} else {
//				String f = (str.charAt(0) + "").toUpperCase();
//				answer += (f + str.substring(1));
//				
//				if(str != arr[arr.length-1]) {
//					answer += " ";
//				};
//			}
//		}
//		
//		if(s.lastIndexOf(" ") == s.length()-1) {
//			answer += " ";
//		}
		
		String answer = "";
        String[] sp = s.toLowerCase().split("");
        
        System.out.println(Arrays.toString(sp));
        
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
            System.out.println(answer);
            System.out.println(flag);
        }

		System.out.println(answer);
	}

	public static void main(String[] args) {
		
		Solution s = new Solution();
		s.solution("3For me  aNd you ");
		
	}

}
