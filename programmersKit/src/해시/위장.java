package �ؽ�;

import java.util.HashMap;

public class ���� {

	public static void main(String[] args) {
		String[][] clothes = {
				{"yellow_hat", "headgear"}, 
				{"blue_sunglasses", "headgear"}, 
				{"green_turban", "headgear"}, 
				{"crow_mask", "face"},
				{"smoky_makeup", "face"},
				{"blue_sunglasses", "eyewear"},
			};
		solution(clothes);
	}
	
	public static int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < clothes.length; i++) {
        	map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        System.out.println(map);
        
        //����� �� : (a+1)*...*(b+1) - 1
        
        //�ʰ��� + ���Դ°�� : a+1
        int answer = 1;
        for(String key : map.keySet()) {
        	answer *= (map.get(key)+1);
        }
        
        //�ƹ��͵� ���� �ʴ� ��� -1
        System.out.println(answer-1);
        return answer-1;
        
        
    }

}
