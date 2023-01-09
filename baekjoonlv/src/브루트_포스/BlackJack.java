package 브루트_포스;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BlackJack {

	//블랙잭
	// 3 / n 장으로 m 이하 최댓값
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int sum = blackjack(arr, n, m);
		System.out.println(sum);
	}
	
	public static int blackjack(int[] arr, int n, int m) {
		int maxsum = 0;
		int sum = 0;
		for(int i = arr.length-1; i >= 2; i--) {
			for(int j = i-1; j >= 1; j--) {
				for(int k = j-1; k >= 0; k--) {
					sum = arr[i] + arr[j] + arr[k];
					if(sum == m) {
						return sum;
					} 
					if (sum < m && sum > maxsum) {
						maxsum = sum;
					}
				}
			}
		}
		return maxsum;
	}

}
