package �⺻_����2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GoldbachsConjecture {

	//�������� ����
	// 2���� ū ��� ¦���� �� �Ҽ��� ������ ��Ÿ�� �� �ִ�. <= 10000
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] prime = new boolean[10001];
		prime[0] = prime[1] = true;
		for(int i = 2; i <= Math.sqrt(10000); i++) {
			if(prime[i]) continue;
			
			for(int j = i*i; j <= 10000; j += i) {
				prime[j] = true;
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			for(int j = n/2; j >= 2; j--) {
				if(!prime[j] && !prime[n-j]) {
					sb.append(j).append(" ").append(n-j).append("\n");
					break;
				}
			}
			
//			int a = gold(n);
//			int b = n - a;
//          sb.append(a + " " + b + "\n");
		}
		
		br.close();
		System.out.println(sb);
	}
	
//	//�Ҽ��Ǻ�
//	public static boolean prime(int n) {
//		for(int i = 2; i <= Math.sqrt(n); i++) {
//			if(n % i == 0) return false;
//		}
//		return true;
//	}
//	
//	public static int gold(int num) {
//		int a = 0;
//		for(int i = num/2; i >= 2; i--) {
//			//�������鼭 �Ҽ�ã��
//			if(prime(i)) {
//				if(prime(num-i)) {
//					//�ٸ����� �Ҽ���
//					a = i;
//					break;
//				}
//			}
//		}
//		return a;
//	}

}
