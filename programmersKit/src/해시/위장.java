package 해시;

import java.util.HashMap;

public class 위장 {

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
        
        //경우의 수 : (a+1)*...*(b+1) - 1
        
        //옷개수 + 안입는경우 : a+1
        int answer = 1;
        for(String key : map.keySet()) {
        	answer *= (map.get(key)+1);
        }
        
        //아무것도 고르지 않는 경우 -1
        System.out.println(answer-1);
        return answer-1;
        
        
    }

}
