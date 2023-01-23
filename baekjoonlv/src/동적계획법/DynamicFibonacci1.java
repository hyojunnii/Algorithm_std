package 동적계획법;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//알고리즘 수업 - 피보나치 수 1
// 동적계획법 : Dynamic Programming (DP)
// 	한번 계산된 문제의 결과를 저장해두고 재사용하는 효율적인 기법
//  큰 문제를 작은 문제로 쪼개서 답을 저장해두고 재활용
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
