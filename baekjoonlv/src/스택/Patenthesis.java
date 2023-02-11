package ½ºÅÃ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//°ýÈ£
public class Patenthesis {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			String s = br.readLine();
			if (proof(s)) {
				sb.append("YES").append('\n');
			}
			else {
				sb.append("NO").append('\n');
			}
		}
		
		System.out.println(sb);
		br.close();
	}
	
	public static boolean proof(String s) {
		if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') {
			return false;
		}
		Stack<Character> stk = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				stk.push('(');
			} else {
				if(stk.isEmpty()) {
					return false;
				}
				stk.pop();
			}
		}
		return stk.isEmpty();
	}

}
