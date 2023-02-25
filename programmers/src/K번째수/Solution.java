package K¹øÂ°¼ö;

import java.util.Arrays;

public class Solution {
	
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for(int i = 0; i < commands.length; i++) {
			int start = commands[i][0] - 1;
			int end = commands[i][1];
			int[] arr = new int[end - start];
			for(int j = 0, t = start; t < end; j++, t++) {
				arr[j] = array[t];
			}
			Arrays.sort(arr);
			answer[i] = arr[commands[i][2]-1];
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		solution(array, commands);
		
	}

}
