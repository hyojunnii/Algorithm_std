package 시저_암호;

public class Solution {
	
	void solution(String s, int n) {
		
		char[] arr = s.toCharArray();
		
		int cnt = 0;
		for(char c : arr) {
			if(c != ' ') {
				if(c <= 'z' && c+n > 'z') {
					int i = c+n - 'z' - 1;
					arr[cnt] = (char)('a'+i);
				} else if (c <= 'Z' && c+n > 'Z') {
					int i = c+n - 'Z' - 1;
					arr[cnt] = (char)('A'+i);
				} else {
					arr[cnt] = (char)(c+n);
				}
			}
			cnt++;
		}
		
		String answer = new String(arr);
		
		System.out.println(answer);
	}

	public static void main(String[] args) {
		
		Solution s = new Solution();
		s.solution("a B z", 4);
		
	}

}
