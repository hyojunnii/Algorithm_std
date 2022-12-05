package 晦獄_熱з1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACMHotel {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken()); //類熱
			int w = Integer.parseInt(st.nextToken()); //寞熱
			int n = Integer.parseInt(st.nextToken()); //n廓簞槳椒
			
			//類熱
			int first;
			//�ˉ�
			int last;
			
			if(n % h == 0) {
				first = h * 100;
				last = n/h;
			} else {
				first = n % h * 100;
				last = n/h + 1;
			}
			
			sb.append(first + last + "\n");
			
		}
		
		System.out.println(sb);
	}

}
