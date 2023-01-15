package 정수론및조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//최소공배수
public class LCM {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int a = A;
			int b = B;
			while(true) {
				if(a % b == 0) break;
				
				int num = a % b;
				a = b;
				b = num;
			}
			
			sb.append(A * B / b).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}

}
