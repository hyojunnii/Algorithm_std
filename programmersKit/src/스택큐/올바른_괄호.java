package ����ť;

import java.util.Stack;

public class �ùٸ�_��ȣ {

	public static void main(String[] args) {
		solution("(())()((())))()");
	}
	
	public static boolean solution(String s) {
        if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') {
        	return false;
        }
        
        //����
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
