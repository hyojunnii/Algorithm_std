package 그리디_알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//동전 0
public class Coin0 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int cnt = 0;
		for(int i = arr.length-1; i >= 0; i--) {
			if(k == 0) break;
			if(arr[i] <= k) {
				cnt++;
				k -= arr[i];
				i++;
			}
		}
		
		System.out.println(cnt);
		br.close();
	}

}
