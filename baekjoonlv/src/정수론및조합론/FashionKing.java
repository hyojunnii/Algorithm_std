package �����й����շ�;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//�мǿ� ���غ�
// ������ ���ϱ�
public class FashionKing {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			for(int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				String kind = st.nextToken();
				
				if(map.containsKey(kind)) {
					map.replace(kind, map.get(kind)+1);
				} else {
					map.put(kind, 1);
				}
			}
			
			int result = 1;
			//���Դ� ��� ������ ����� �� -> ����1+1 * ����2+1 ...
			// hat 2�� eye 1�� -> 3 * 2
			for(int num : map.values()) {
				result *= num+1;
			}
			
			//�ƹ��͵� ���Դ°�� ����
			sb.append(result - 1).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
}
