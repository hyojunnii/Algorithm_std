package ¹®ÀÚ¿­;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RepeatString {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int r;
		String[] arr;
		for(int i = 0; i < t; i++) {
			String s = "";
			st = new StringTokenizer(br.readLine());
			r = Integer.parseInt(st.nextToken());
			arr = st.nextToken().split("");
			
			for(int j = 0; j < arr.length; j++) {
				s += arr[j].repeat(r);
			}
			
			sb.append(s + "\n");
		}
		br.close();
		System.out.println(sb);
		
	}

}
