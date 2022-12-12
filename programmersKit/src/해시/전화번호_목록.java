package 해시;

import java.util.HashSet;

public class 전화번호_목록 {

	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		solution(phone_book);
	}
	
	public static boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<String>();
        
        for(String s : phone_book) {
        	set.add(s);
        }
        
        for(String s : phone_book) {
        	for(int i = 0; i < s.length(); i++) {
        		if(set.contains(s.substring(0, i))) {
        			return false;
        		};
        	}
        }
        
        return true;
    }

}
