package 스택큐;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능개발 {

	public static void main(String[] args) {
		
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1,1,1,1,1,1};
		solution(progresses, speeds);
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
        
		Queue<Integer> q = new LinkedList<Integer>();
		
		//배포가능일 계산, 큐에 넣기
		for(int i = 0; i < progresses.length; i++) {
			//나머지 있으면 +1일
			if((100 - progresses[i]) % speeds[i] == 0) {
				q.offer((100 - progresses[i]) / speeds[i]);
			} else {
				q.offer((100 - progresses[i]) / speeds[i] + 1);
			}
		}
		
		//배포날 / 갯수
		int day = q.peek();
		int cnt = 0;
		//갯수 저장
		List<Integer> list = new ArrayList<>();
		
		while(!q.isEmpty()) {
			//배포날보다 작거나 같으면
			if(q.peek() <= day) {
				q.poll();
				cnt++;
			} else {
				list.add(cnt);
				//다음 배포날 세팅
				day = q.poll();
				cnt = 1;
			}
		}
		//마지막 cnt넣기
		list.add(cnt);
		
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
    }

}
