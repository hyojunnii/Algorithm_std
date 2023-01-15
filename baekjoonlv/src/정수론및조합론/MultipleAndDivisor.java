package 정수론및조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//배수와 약수
public class MultipleAndDivisor {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			String s = br.readLine();
			if("0 0".equals(s)) break;
			
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
		
			if(b % a == 0) {
				System.out.println("factor");
			} else if(a % b == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}
		br.close();
	}

}
