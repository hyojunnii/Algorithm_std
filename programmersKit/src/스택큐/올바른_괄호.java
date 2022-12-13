package 스택큐;

import java.util.Stack;

public class 올바른_괄호 {

	public static void main(String[] args) {
		solution("(())()((())))()");
	}
	
	public static boolean solution(String s) {
        if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') {
        	return false;
        }
        
        //스택
//        Stack<Character> stack = new Stack<>();
//        
//        for(int i = 0; i < s.length(); i++) {
//        	if(s.charAt(i) == '(') {
//        		stack.push('(');
//        	} else {
//        		if(stack.isEmpty()) {
//        			return false;
//        		}
//        		stack.pop();
//        	}
//        }
//        return stack.isEmpty();
        
        //cnt
        int cnt = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == '(') {
        		cnt++;
        	} else {
        		cnt--;
        	}
        	if(cnt < 0) {
        		return false;
        	}
        }
        
        if(cnt == 0) {
        	return true;
        } else {
        	return false;
        }
    }
}
