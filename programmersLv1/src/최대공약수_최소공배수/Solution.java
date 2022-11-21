package 최대공약수_최소공배수;

import java.util.Arrays;

public class Solution {
	
	//유클리드 호제법
	int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        while (min > 0) {
        	int temp = max % min;
        	max = min;
        	min = temp;
        }
        
//        answer[0] = max;
//        answer[1] = (n*m) / max;
        
        answer[0] = gcd(n,m);
        answer[1] = (n*m) / answer[0];
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
	
	//재귀함수 사용
	int gcd(int p, int q) {
		if(q == 0) return p;
		return gcd(q, p%q);
	}
	

	public static void main(String[] args) {

		Solution s = new Solution();
		s.solution(3, 12);
		
	}

}
