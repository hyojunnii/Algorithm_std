package 해시;

import java.util.HashMap;

public class 완주하지_못한_선수 {

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden", "kiki"}; 
		String[] completion = {"eden", "kiki", "leo"}; 
		solution(participant, completion);
	}
	
    public static String solution(String[] participant, String[] completion) {
        
    	HashMap<String, Integer> map = new HashMap<>();
    	//동명이인 있으면 값증가
        for(String s : participant) {
        	map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        //Map은 중복 키 넣으면 대체됨
        for(String s : completion) {
        	map.put(s, map.get(s) - 1);
        }
        
        String answer = "";
        for(String key : map.keySet()) {
        	if(map.get(key) != 0) {
        		answer = key;
        		break;
        	}
        }
        
        return answer;
    }

}
