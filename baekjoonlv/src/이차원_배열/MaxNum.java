package ������_�迭;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxNum {

	//2���� �迭 �� �ִ� ã��
	// 0�� 81���ϰ�쵵 ���
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int max = 0;
		int row = 0;
		int col = 0;
		
		int num = 0;
		for(int t = 0; t < 9; t++) {
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < 9; i++) {
				num = Integer.parseInt(st.nextToken());
				if(num >= max) {
					max = num;
					row = t+1;
					col = i+1;
				}
			}
		}
		br.close();
		System.out.println(max);
		System.out.println(row + " " + col);
	}

}
