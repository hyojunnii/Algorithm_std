package 재귀;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//알고리즘 수업 - 병합 정렬 1
// 병합정렬 알고리즘 제공, k번째 저장되는 수 구하기
public class AlignMerge {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		A = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		tmp = new int[n];
		
		merge_sort(A, 0, n-1);
		System.out.println(answer);
		br.close();
	}
	
	static int[] tmp, A;
	static int k;
	static int cnt = 0;
	static int answer = -1;
	
	public static void merge_sort(int[] A, int p, int r) {
		if(cnt >= k) return;
		if(p < r) {
			int q = (p + r) / 2;
			merge_sort(A, p, q);
			merge_sort(A, q+1, r);
			merge(A, p, q, r);
		}
	}
	
	public static void merge(int[] A, int p, int q, int r) {
		int i = p;
		int j = q + 1;
		int t = 0;
		
		while(i <= q && j <= r) {
			if(A[i] <= A[j]) {
				tmp[t] = A[i];
				i++;
			} else {
				tmp[t] = A[j];
				j++;
			}
			t++;
		}
		
		while (i <= q) {
			tmp[t++] = A[i++];
		}
	    while (j <= r) {
	    	tmp[t++] = A[j++];
	    }
	    
	    i = p; t = 0;
	    while (i <= r) {
	    	//저장될때 카운트
	    	cnt++;
	    	if(cnt == k) {
	    		answer = tmp[t];
	    		break;
	    	}
	    	A[i++] = tmp[t++];
	    }
	}

}
