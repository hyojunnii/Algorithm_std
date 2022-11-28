package 일차원_배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OXQuiz {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		String s;
		int cnt, result;
		
		for(int i = 0; i < n; i++) {
			s = br.readLine();
			cnt = 0;
			result = 0;
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == 'O') {
					cnt++;
					result += cnt;
				} else {
					cnt = 0;
				}
			}
			sb.append(result + "\n");
		}
		
		System.out.println(sb);
	}

}
