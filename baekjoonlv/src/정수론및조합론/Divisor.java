package 정수론및조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//약수
// 약수의 성질
// n = 20 / n의 약수 : 2, 4, 5, 10 -> 최댓값 * 최솟값
public class Divisor {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		
		System.out.println(max * min);
		br.close();
	}

}
