package �⺻_����1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
		
		//up���� down�� �ϳ� ����
		int day = (length - down) / (up - down);
		
		//������ ������ �Ϸ� �� �ɸ�
		if((length - down) % (up - down) != 0) {
			day++;
		}
		
		System.out.println(day);
		
//		int m = 0;
//		
//		while(true) {
//			day++;
//			m += a;
//			if(m >= v) {
//				break;
//			}
//			m -= b;
//		}
//		
	}

}
