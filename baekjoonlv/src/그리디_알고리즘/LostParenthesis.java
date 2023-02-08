package 그리디_알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//잃어버린 괄호
public class LostParenthesis {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		String[] minus = s.split("-");
		
		int answer = 0;
		for(int i = 0; i < minus.length; i++) {
			if(minus[i].contains("+")) {
				int tmp = 0;
				String[] plus = minus[i].split("\\+");
				for(int j = 0; j < plus.length; j++) {
					tmp += Integer.parseInt(plus[j]);
				}
				if(i == 0) {
					answer = tmp; continue;
				}
				answer -= tmp;
			}
			else {
				if(i == 0) answer = Integer.parseInt(minus[i]);
				else answer -= Integer.parseInt(minus[i]);
			}
		}
		
		System.out.println(answer);
		br.close();
	}

}
