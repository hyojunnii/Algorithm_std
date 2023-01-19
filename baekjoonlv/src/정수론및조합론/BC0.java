package �����й����շ�;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//���� 0�� ���� - ��α�����
// (n r) nCr = n! / (n-r)!r!
// ���տ��� 2�� 5 ���ϱ�
// nCm{2^k,5^k} = n!/n-r!r! {2^k, 5^k}
//			  = 2^a1*5^a2 / 2^b1*5^b2 * 2^a3*5^b3
//		      = 2^a1-b1-c1 * 5^a2-b2-c2
public class BC0 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
	
		//2 ���� (�������� �����ϹǷ� 5�� ������ ���� �ȵ�)
		int two = twoPower(n) - twoPower(n-m) - twoPower(m);
		
		//5 ����
		int five = fivePower(n) - fivePower(n-m) - fivePower(m);
		
		System.out.println(Math.min(two, five));
		br.close();
	}
	
	public static int twoPower(int n) {
		int cnt = 0;
		while(n >= 2) {
			cnt += n / 2;
			n /= 2;
		}
		return cnt;
	}
	
	public static int fivePower(int n) {
		int cnt = 0;
		while(n >= 5) {
			cnt += n / 5;
			n /= 5;
		}
		return cnt;
	}

}
