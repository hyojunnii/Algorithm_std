package 정수론및조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//조합 0의 개수 - 블로그참고
// (n r) nCr = n! / (n-r)!r!
// 조합에서 2와 5 구하기
// nCm{2^k,5^k} = n!/n-r!r! {2^k, 5^k}
//			  = 2^a1*5^a2 / 2^b1*5^b2 * 2^a3*5^b3
//		      = 2^a1-b1-c1 * 5^a2-b2-c2
public class BC0 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
	
		//2 개수 (나눗셈을 포함하므로 5의 개수만 세면 안됨)
		int two = twoPower(n) - twoPower(n-m) - twoPower(m);
		
		//5 개수
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
