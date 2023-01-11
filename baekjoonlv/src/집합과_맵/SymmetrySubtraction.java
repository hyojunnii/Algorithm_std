package 집합과_맵;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

//대칭 차집합
public class SymmetrySubtraction {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()); //집합a
		int b = Integer.parseInt(st.nextToken()); //집합b
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < a; i++) {
			A.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < b; i++) {
			B.add(Integer.parseInt(st.nextToken()));
		}
		
		int cnt = Subtraction(A, B) + Subtraction(B, A);
		
		br.close();
		System.out.println(cnt);
	}
	
	public static int Subtraction(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		HashSet<Integer> set = new HashSet<Integer>(list1);
		int cnt = list1.size();
		
		for(int i = 0; i < list2.size(); i++) {
			if(set.contains(list2.get(i))) {
				cnt--;
			}
		}
		return cnt;
	}

}
