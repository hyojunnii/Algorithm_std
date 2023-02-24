package 최솟값_만들기;

import java.util.Arrays;

public class Solution {
	
	void solution(int []A, int []B) {
		Arrays.sort(A);
		Arrays.sort(B);
		int answer = 0;
		
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		
		int cnt = B.length-1;
		for(int i = 0; i < A.length; i++) {
			answer += A[i] * B[cnt];
			cnt--;
		}
		
		System.out.println(answer);
	}

	public static void main(String[] args) {
		int[] A = {1,4,2};
		int[] B = {5,4,4};
		
		Solution s = new Solution();
		s.solution(A,B);
		
	}

}
