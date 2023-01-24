package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class SortInsight {

	//소트인사이트 - 수내림차순
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		char[] arr = n.toCharArray();
		Arrays.sort(arr);
		
		String answer = "";
		for(int i = arr.length-1; i >= 0; i--) {
			answer += arr[i];
		}
		
		System.out.println(Integer.parseInt(answer));
		sc.close();
	}

}
