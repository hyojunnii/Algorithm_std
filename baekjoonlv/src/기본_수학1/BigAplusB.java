package 기본_수학1;

import java.util.*;
import java.io.*;
import java.math.*;

public class BigAplusB {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		//*Math의 BigInteger 클래스 사용
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		A = A.add(B);
		
		System.out.println(A.toString());
		
		
		
		//*배열 사용해서 직접 연산
//		String a = st.nextToken();
//		String b = st.nextToken();
//		
//		int max = Math.max(a.length(), b.length());
//		
//		//큰자리수기준, 한자리올림가능하도록
//		int[] A = new int[max + 1];
//		int[] B = new int[max + 1];
//		
//		//A 채우기
//		for(int i = a.length()-1, idx = 0; i >= 0; i--, idx++) {
//			A[idx] = a.charAt(i) - '0'; //맨뒤부터, 정수넣기 위해 -'0'
//		}
//		
//		//B 채우기
//		for(int i = b.length()-1, idx = 0; i >= 0; i--, idx++) {
//			B[idx] = b.charAt(i) - '0';
//		}
//		
//		//덧셈
//		for(int i = 0; i < max; i++) {
//			int val = A[i] + B[i];
//			A[i] = val % 10; //10나눈 나머지
//			A[i+1] += (val / 10); //기존값 + 10나눈 몫
//		}
//		
//		StringBuilder sb = new StringBuilder();
//		//역순으로 출력, 맨 앞은 따로 판별
//		if(A[max] != 0) {
//			sb.append(A[max]);
//		}
//		for(int i = max-1; i >= 0; i--) {
//			sb.append(A[i]);
//		}
//		
//		System.out.println(sb);
	
	}

}
