package ����ť;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ��ɰ��� {

	public static void main(String[] args) {
		
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1,1,1,1,1,1};
		solution(progresses, speeds);
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
        
		Queue<Integer> q = new LinkedList<Integer>();
		
		//���������� ���, ť�� �ֱ�
		for(int i = 0; i < progresses.length; i++) {
			//������ ������ +1��
			if((100 - progresses[i]) % speeds[i] == 0) {
				q.offer((100 - progresses[i]) / speeds[i]);
			} else {
				q.offer((100 - progresses[i]) / speeds[i] + 1);
			}
		}
		
		//������ / ����
		int day = q.peek();
		int cnt = 0;
		//���� ����
		List<Integer> list = new ArrayList<>();
		
		while(!q.isEmpty()) {
			//���������� �۰ų� ������
			if(q.peek() <= day) {
				q.poll();
				cnt++;
			} else {
				list.add(cnt);
				//���� ������ ����
				day = q.poll();
				cnt = 1;
			}
		}
		//������ cnt�ֱ�
		list.add(cnt);
		
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
    }

}
