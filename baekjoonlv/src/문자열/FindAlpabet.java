package ¹®ÀÚ¿­;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindAlpabet {
	
	public static int alpabet(char a, String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == a) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		br.close();
		
		int[] arr = new int[26];
		char al = 'a';
		
		for(int i = 0; i < 26; i++) {
			int r = alpabet(al, s);
			arr[i] = r;
			al++;
		}
		
		String answer = Arrays.toString(arr).replace("[", "").replace("]", "").replace(",", "");
		System.out.println(answer);
	}

}
