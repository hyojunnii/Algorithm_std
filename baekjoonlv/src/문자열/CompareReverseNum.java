package ¹®ÀÚ¿­;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CompareReverseNum {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		int a = Integer.parseInt(new String(new StringBuilder(st.nextToken()).reverse()));
		int b = Integer.parseInt(new String(new StringBuilder(st.nextToken()).reverse()));
		
		System.out.println(Math.max(a, b));

	}

}
