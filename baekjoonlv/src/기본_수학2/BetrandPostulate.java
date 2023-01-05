package �⺻_����2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BetrandPostulate {

	//����Ʈ�� ����
	// �ڿ��� n���� ũ�� 2n���� �۰ų� ���� �Ҽ��� ��� �ϳ� ������
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			
			boolean[] arr = new boolean[2*n+1];
			arr[0] = true;
			arr[1] = true;
			
			for(int i = 2; i <= Math.sqrt(2*n); i++) {
				if(arr[i] == true) continue;
				
				//i�� ��� ���� true
				for(int j = 2; i*j <= 2*n; j++) {
					arr[i*j] = true;
				}
			}
			
			int cnt = 0;
			for(int i = n+1; i <= 2*n; i++) {
				if(arr[i] == false) cnt++;
			}
			
			sb.append(cnt + "\n");
		}
		br.close();
		System.out.println(sb);
		
	}

}
