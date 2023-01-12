package ±âÇÏ1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RightTriangle {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String s = br.readLine();
			if("0 0 0".equals(s)) break;
			
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a > b && a > c) {
				sb.append(pythagoras(a, b, c));
			} else if(b > a && b > c) {
				sb.append(pythagoras(b, a, c));
			} else {
				sb.append(pythagoras(c, a, b));
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static String pythagoras(int hypo, int x, int y) {
		if(hypo*hypo == x*x + y*y) {
			return "right";
		} else {
			return "wrong";
		}
	}
}

