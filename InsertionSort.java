
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15, 4, 18, 8, 19, 22, 24, 59, 59, 20, 18, 12, 36, 42, 9};

		int i;
		int j;
		int tempvar;
		
		for(i=1; i<arr.length; i++){
			j=i;
			while(j>0 && (arr[j] < arr[j-1])) {
				tempvar = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = tempvar;
				j--;
			}
		}

		printArray(arr);
	}
	
	public static void printArray(int[] otherArray) {
		int i;
		for(i = 0; i < otherArray.length; i++) {
			System.out.print(otherArray[i] +" ");
		}
	}
}
