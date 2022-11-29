package 문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CntWord {

	public static void main(String[] args) throws Exception {

//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		String[] arr = str.split(" ");
//		
//		int cnt = 0;
//		for(String s : arr) {
//			if("".equals(s)) {
//				continue;
//			}
//			cnt++;
//		}
//		
//		System.out.println(cnt);
		
		/*
		 * StringTokenizer 활용
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		System.out.println(st.countTokens());
		
	}

}
