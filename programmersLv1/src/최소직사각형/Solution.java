package 최소직사각형;

public class Solution {
	
	int solution(int[][] sizes) {
		
		int tmp = 0;
		int max1 = sizes[0][0];
		int max2 = sizes[0][1];
		for(int i = 0; i < sizes.length; i++) {
			if(sizes[i][1] > sizes[i][0]) {
				tmp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = tmp;
			}
			max1 = Math.max(max1, sizes[i][0]);
			max2 = Math.max(max2, sizes[i][1]);
		}
		
		return max1 * max2;
	}

	public static void main(String[] args) {
		
		int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		
		Solution s = new Solution();
		System.out.println(s.solution(sizes));
		
	}

}
