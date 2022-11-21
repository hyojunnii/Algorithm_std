package 이상한_문자_만들기;

public class Solution {
	
	String solution(String s) {
		
		String answer = "";
		int cnt = 0;
		
        for(int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		String ch = Character.toString(c);
    		
    		if(" ".equals(ch)) {
    			cnt = 0;
    			answer += " ";
    			continue;
    		}
    		
    		if(cnt % 2 == 0) {
        		answer += ch.toUpperCase();
        	} else {
        		answer += ch.toLowerCase();
        	}
    		
    		cnt++;
        }
        
        System.out.println(answer);
        return answer;
    }
	
	//array
	String array(String s) {
		
		String answer = "";
		int cnt = 0;
		String[] array = s.split("");
		
		for(String ss : array) {
			cnt = ss.contains(" ") ? 0 : cnt + 1;
			answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		
		Solution s = new Solution();
		s.solution("try hello world");

	}

}
