package 반복문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AplusB5 {

	public static void main(String[] args) throws Exception {
	
		/*
		 * StringBuilder - 메모
		 * new StringBuilder()
		 * sb.append()
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		int a,b;
		while(true) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0) {break;}
			sb.append((a+b) + "\n");
		}
		br.close();
		
		System.out.println(sb);
	}

}
