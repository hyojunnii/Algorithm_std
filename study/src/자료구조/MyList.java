package 자료구조;

public class MyList {
	
	private Object[] arr;
	private int emptyIdx;
	
	public MyList() {
		arr = new Object[1];
		emptyIdx = 0;
	}
	
	//add
	public void add(Object data) {
		arr[emptyIdx] = 0;
		
		if(emptyIdx == arr.length-1) {
			doubling();
		}
		
		emptyIdx++;
	}
	
	//arr 2��� �ø���
	public void doubling() {
		Object[] newArr = new Object[arr.length * 2];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}
	
	//remove
	public void remove(int index) {
		for(int i = index; i < emptyIdx-1; i++) {
			arr[i] = arr[i+1];
		}
		emptyIdx--;
	}
	
	//get
	public Object get(int index) {
		return arr[index];
	}
	
	//size
	public int size() {
		return emptyIdx;
	}
	
	//�迭 ��� ��� ���
	public void printInfo() {
		for(int i = 0; i < emptyIdx; i++) {
			System.out.println(arr[i]);
		}
	}

	//������ 2��� �ø���
}
