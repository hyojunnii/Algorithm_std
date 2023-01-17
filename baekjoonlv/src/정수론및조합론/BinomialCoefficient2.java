package 정수론및조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//이항 계수 2 - 블로그참고
// 이항계수의 성질 이용
// 1. 파스칼의 법칙(파스칼의 삼각형)
//	 n+1Cr+1 = nCr + nCr+1
//	 => (n r) = (n-1 r-1) + (n-1 r)
// 2. nC0 = nCn = 1
//	 => (n 0) = (n r) = 1

// 모듈러(mod) 성질 : a%m = r -> m으로 나눈 나머지 r에 대해 a는 유일하지 않다
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
	
	//재귀 성능 높이기 - 메모이제이션(이미 푼 경우 다시 활용)
	public static int[][] memo;
	
	public static int BC(int n, int k) {
		if(memo[n][k] > 0) {
			return memo[n][k];
		}
		
		//이항계수의 성질
		if(n == k || k == 0) {
			return memo[n][k] = 1;
		} else {
			// 20!가 넘어가면 long타입도 벗어나게 되기 때문에 모듈러 성질 이용
			return memo[n][k] = (BC(n-1, k-1) + BC(n-1, k)) % 10007;
		}
	}
	
}
