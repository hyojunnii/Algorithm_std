package ÇÔ¼ö;

public class Sum {
	
	long sum(int[] a) {
		long answer = 0;
		for(int i = 0; i < a.length; i++) {
			answer += a[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		Sum sum = new Sum();
		System.out.println(sum.sum(a));
	}

}
