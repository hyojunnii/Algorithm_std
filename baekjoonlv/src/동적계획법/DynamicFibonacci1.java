package ������ȹ��;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//�˰��� ���� - �Ǻ���ġ �� 1
// ������ȹ�� : Dynamic Programming (DP)
// 	�ѹ� ���� ������ ����� �����صΰ� �����ϴ� ȿ������ ���
//  ū ������ ���� ������ �ɰ��� ���� �����صΰ� ��Ȱ��
public class DynamicFibonacci1 {
	
	public static int[] arr;
	public static int cnt = 0;
	public static int dpcnt = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		fib(n);
		fibonacci(n);
		
		System.out.println(cnt + " " + dpcnt);
		br.close();
	}
	
	public static int fib(int n) {
		if(n == 1 || n == 2) {
			cnt++;
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static int fibonacci(int n) {
		arr[0] = arr[1] = 1;
		
		for(int i = 2; i < n; i++) {
			dpcnt++;
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return arr[n-1];
	}

}
