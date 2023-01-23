package 동적계획법;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//신나는 함수 실행
public class FunctionExecute {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			String s = br.readLine();
			if("-1 -1 -1".equals(s)) {
				break;
			}
			
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			sb.append("w(" + a + ", " + b + ", " + c + " = ");
			sb.append(w(a,b,c));
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
	public static int w(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}

		if (a > 20 || b > 20 || c > 20) {
			return w(20, 20, 20);
		}

		if (a < b && b < c) {
		    return w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		}
		
		return w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}

}
