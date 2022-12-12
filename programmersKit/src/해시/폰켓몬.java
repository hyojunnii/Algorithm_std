package 해시;

import java.util.HashSet;

public class 폰켓몬 {

	public static void main(String[] args) {
		int[] nums = {3,1,2,3};
		solution(nums);
	}
	
	public static int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums) {
        	set.add(num);
        }
        
        if(set.size() >= (nums.length / 2)) {
        	return nums.length / 2;
        } else {
        	return set.size();
        }
        
    }

}
