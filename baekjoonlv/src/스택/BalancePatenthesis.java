package ½ºÅÃ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//°ýÈ£
public class BalancePatenthesis {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String s = br.readLine();
			if(".".equals(s)) break;
			
			if(proof(s)) {
				sb.append("yes").append('\n');
			}
			else {
				sb.append("no").append('\n');
			}
		}
		
		System.out.println(sb);
		br.close();
	}
	
	public static boolean proof(String s) {
		Stack<Character> stk = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				stk.push('(');
			}
			else if(s.charAt(i) == '[') {
				stk.push('[');
			}
			
			else if(s.charAt(i) == ')') {
				if(stk.isEmpty() || stk.get(stk.size()-1) != '(') {
					return false;
				}
				stk.pop();
			}
			else if(s.charAt(i) == ']') {
				if(stk.isEmpty() || stk.get(stk.size()-1) != '[') {
					return false;
				}
				stk.pop();
			}
		}
		
		return stk.isEmpty();
	}

}
