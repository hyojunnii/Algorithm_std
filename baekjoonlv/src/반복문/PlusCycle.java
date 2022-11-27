package ¹Ýº¹¹®;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlusCycle {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		br.close();
		
		if(Integer.parseInt(n) < 10) {
			n = "0" + n;
		}
		
		String[] arr = n.split("");
		String m = "";
		int cnt = 0;
		int sum;
		while(!n.equals(m)) {
			sum = (Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
			arr[0] = arr[1];
			arr[1] = (sum % 10) + "";
			m = arr[0] + arr[1];
			cnt++;
		}
		
		System.out.println(cnt);
	}

}
