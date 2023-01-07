package 정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Statistics {

	//통계학 - 평균, 중앙값, 최빈값, 범위
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Integer[] arr = new Integer[n];
		//Counting Sort - 데이터 값 카운팅 정렬, 시간복잡도 O(n), 수의 범위 클수록 메모리낭비
		int[] count = new int[8001];
		
		double sum = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			count[arr[i]+4000]++;
		}
		
		Arrays.sort(arr);
		
		int freq = 0; //빈도수
		int freqnum = 0; //최빈값
		boolean flag = false;
		for(int i = 0; i < 8001; i++) {
			if(freq < count[i]) {
				freq = count[i];
				freqnum = i - 4000;
				flag = true;
			} else if (freq == count[i] && flag == true) {
				freqnum = i - 4000;
				flag = false;
			}
		}

		System.out.println(Math.round(sum / n)); //산술평균
		System.out.println(arr[n/2]); //중앙값
		System.out.println(freqnum); //최빈값
		System.out.println(arr[arr.length-1] - arr[0]); //범위
	}
}
