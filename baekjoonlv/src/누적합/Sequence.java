package ������;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//����
// 3���� ��� - https://nahwasa.com/entry/%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%A4%80-2559-%EC%88%98%EC%97%B4-boj-java
// 1. ������
// 2. �����̵�������
// 3. ��������
public class Sequence {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()); //����
		int k = Integer.parseInt(st.nextToken()); //�����ϼ�
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i <= n-k; i++) {
			int sum = 0;
			for(int j = i; j < i+k; j++) {
				sum += arr[j];
			}
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
		br.close();
	}

}
