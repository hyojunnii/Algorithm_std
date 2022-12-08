package �⺻_����1;

import java.util.*;
import java.io.*;
import java.math.*;

public class BigAplusB {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		//*Math�� BigInteger Ŭ���� ���
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		A = A.add(B);
		
		System.out.println(A.toString());
		
		
		
		//*�迭 ����ؼ� ���� ����
//		String a = st.nextToken();
//		String b = st.nextToken();
//		
//		int max = Math.max(a.length(), b.length());
//		
//		//ū�ڸ�������, ���ڸ��ø������ϵ���
//		int[] A = new int[max + 1];
//		int[] B = new int[max + 1];
//		
//		//A ä���
//		for(int i = a.length()-1, idx = 0; i >= 0; i--, idx++) {
//			A[idx] = a.charAt(i) - '0'; //�ǵں���, �����ֱ� ���� -'0'
//		}
//		
//		//B ä���
//		for(int i = b.length()-1, idx = 0; i >= 0; i--, idx++) {
//			B[idx] = b.charAt(i) - '0';
//		}
//		
//		//����
//		for(int i = 0; i < max; i++) {
//			int val = A[i] + B[i];
//			A[i] = val % 10; //10���� ������
//			A[i+1] += (val / 10); //������ + 10���� ��
//		}
//		
//		StringBuilder sb = new StringBuilder();
//		//�������� ���, �� ���� ���� �Ǻ�
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
