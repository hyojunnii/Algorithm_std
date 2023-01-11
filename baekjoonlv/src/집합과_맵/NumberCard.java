package ���հ�_��;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//���� ī�� ��Ī
public class NumberCard {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine()); //����� ī��
		boolean[] arr = new boolean[20000001];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[num+10000000] = true;
		}
		
		int m = Integer.parseInt(br.readLine()); //�־����� ����
		
		int[] nums = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i : nums) {
			if(arr[i+10000000]) {
				sb.append("1 ");
			} else {
				sb.append("0 ");
			}
		}
		
		System.out.println(sb);
		
	}

}
