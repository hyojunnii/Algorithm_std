package �׸���_�˰���;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int cnt = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += cnt;
			sum += arr[i];
			cnt += arr[i];
		}
		
		System.out.println(sum);
		br.close();
	}

}
