package �����й����շ�;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//���� ��� 2 - ��α�����
// ���װ���� ���� �̿�
// 1. �Ľ�Į�� ��Ģ(�Ľ�Į�� �ﰢ��)
//	 n+1Cr+1 = nCr + nCr+1
//	 => (n r) = (n-1 r-1) + (n-1 r)
// 2. nC0 = nCn = 1
//	 => (n 0) = (n r) = 1

// ��ⷯ(mod) ���� : a%m = r -> m���� ���� ������ r�� ���� a�� �������� �ʴ�
// 1. (a+b) % m = (a%m + b%m) % m
// 2. (a*b) % m = (a%m * b%m) % m
public class BinomialCoefficient2 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		memo = new int[n+1][k+1];

		System.out.println(BC(n, k));
		br.close();
	}
	
	//��� ���� ���̱� - �޸������̼�(�̹� Ǭ ��� �ٽ� Ȱ��)
	public static int[][] memo;
	
	public static int BC(int n, int k) {
		if(memo[n][k] > 0) {
			return memo[n][k];
		}
		
		//���װ���� ����
		if(n == k || k == 0) {
			return memo[n][k] = 1;
		} else {
			// 20!�� �Ѿ�� longŸ�Ե� ����� �Ǳ� ������ ��ⷯ ���� �̿�
			return memo[n][k] = (BC(n-1, k-1) + BC(n-1, k)) % 10007;
		}
	}
	
}
