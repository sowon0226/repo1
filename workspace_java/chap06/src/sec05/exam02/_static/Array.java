package sec05.exam02._static;

public class Array {
	
	// 배열
	int length;
	int[] arr;

	Array(int length){
		this.length = length;
		arr = new int[this.length];
	}
	int get(int index) {
		return arr[index];
	}
	
}
