package 정수론및조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//이항 계수 1 
// 이항계수(조합) : 순서없는 경우의 수
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
	
	//팩토리얼 - 시간복잡도 높음 O(n!)
	public static int factorial(int n) {
		//factorial(0) == 1
		if(n <= 1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}	
	}

}
