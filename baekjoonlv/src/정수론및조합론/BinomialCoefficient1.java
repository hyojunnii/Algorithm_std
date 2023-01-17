package �����й����շ�;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//���� ��� 1 
// ���װ��(����) : �������� ����� ��
// nCk = n! / (n-k)!k!
public class BinomialCoefficient1 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int answer = factorial(n) / (factorial(n-k) * factorial(k));
		
		System.out.println(answer);
		br.close();
	}
	
	//���丮�� - �ð����⵵ ���� O(n!)
	public static int factorial(int n) {
		//factorial(0) == 1
		if(n <= 1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}	
	}

}
