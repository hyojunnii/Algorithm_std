package 그리디_알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//주유소
public class OilStation {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		long[] dist = new long[n-1];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n-1; i++) {
			dist[i] = Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		long[] price = new long[n];
		for(int i = 0; i < n; i++) {
			price[i] = Long.parseLong(st.nextToken());
		}
		
		long sum = dist[0] * price[0];
		
		long min = price[0];
		for(int i = 1; i < n-1; i++) {
			min = Math.min(min, price[i]);
			sum += min * dist[i];
		}
		
		System.out.println(sum);
		br.close();
	}

}
