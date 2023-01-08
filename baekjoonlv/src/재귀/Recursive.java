package Àç±Í;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Recursive {
	
	//Àç±ÍÅ×½ºÆ®
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			String s = br.readLine();
			sb.append(isPalindrome(s)).append(" ").append(result).append("\n");
			result = 0;
		}
		
		System.out.println(sb);
	}
	
	static int result;
	
	public static int recursion(String s, int l, int r){
		result++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
	
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }


}
