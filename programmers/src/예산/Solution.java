package ¿¹»ê;

import java.util.Arrays;

public class Solution {
	
	int solution(int[] d, int budget) {
		int answer = 0;
        
        Arrays.sort(d);
        
		for(int i : d) {
			if(budget >= i) {
                answer++;
				budget -= i;
			} else {
                break;
            }
		}
        return answer;
	}

	public static void main(String[] args) {
		
		int[] d = {1,3,2,5,4};
		
		Solution s = new Solution();
		s.solution(d, 9);
		
	}

}
