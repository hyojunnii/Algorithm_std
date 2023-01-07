package ����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Statistics {

	//����� - ���, �߾Ӱ�, �ֺ�, ����
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Integer[] arr = new Integer[n];
		//Counting Sort - ������ �� ī���� ����, �ð����⵵ O(n), ���� ���� Ŭ���� �޸𸮳���
		int[] count = new int[8001];
		
		double sum = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			count[arr[i]+4000]++;
		}
		
		Arrays.sort(arr);
		
		int freq = 0; //�󵵼�
		int freqnum = 0; //�ֺ�
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

		System.out.println(Math.round(sum / n)); //������
		System.out.println(arr[n/2]); //�߾Ӱ�
		System.out.println(freqnum); //�ֺ�
		System.out.println(arr[arr.length-1] - arr[0]); //����
	}
}
