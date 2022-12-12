package �ؽ�;

import java.util.HashMap;

public class ��������_����_���� {

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden", "kiki"}; 
		String[] completion = {"eden", "kiki", "leo"}; 
		solution(participant, completion);
	}
	
    public static String solution(String[] participant, String[] completion) {
        
    	HashMap<String, Integer> map = new HashMap<>();
    	//�������� ������ ������
        for(String s : participant) {
        	map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        //Map�� �ߺ� Ű ������ ��ü��
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
