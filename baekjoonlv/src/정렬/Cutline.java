package ����;

import java.io.*;
import java.util.*;

public class Cutline {

	//���� ĿƮ����
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //������
		int k = Integer.parseInt(st.nextToken()); //�����
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		Arrays.sort(arr);
		System.out.println(arr[n-k]);
		
		//�������� ����
//		Integer[] arr2 = new Integer[n];
//		Arrays.sort(arr2, Collections.reverseOrder());
//		System.out.println(arr2[k-1]);
		
	}

}
