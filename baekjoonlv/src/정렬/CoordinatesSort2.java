package ����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CoordinatesSort2 {

	//��ǥ���� - y > x
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			//���� �ݴ�� ����
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][0] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		
		//���� �ݴ�� ���
		for(int i = 0; i < n; i++) {
			sb.append(arr[i][1]).append(" ").append(arr[i][0]).append("\n");
		}
		
		System.out.println(sb);
	}

}
