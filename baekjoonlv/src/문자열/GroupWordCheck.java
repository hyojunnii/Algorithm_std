package ¹®ÀÚ¿­;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class GroupWordCheck {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String s;
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			s = br.readLine();
			
			String[] arr = s.split("");
			Set<String> set = new HashSet<String>();
			for(String str : arr) {
				set.add(str);
			}
			
			cnt++;
			set.remove(arr[0]);
			for(int j = 0; j < arr.length-1; j++) {
				if(!arr[j].equals(arr[j+1])) {
					if(!set.remove(arr[j+1])) {
						cnt--;
						break;
					}
				}
			}
		}
		br.close();
		
		System.out.println(cnt);
	}

}
