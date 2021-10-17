package BubbleSort;

public class Main {
	public static void main(String arg[]) {
		int[] array = {1,10,5,8,7,6,4,3,2,9};
		int temp=0;
		int size = array.length;
		
		System.out.println("Original ver.");
		for(int r : array) {
			System.out.print(r + " ");
		}
		
		for(int i = size -1 ; i > 0 ;i--) {
			for(int j = i - 1 ;j >= 0; j--) {
				if(array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println("\nSorted ver.");
		for(int r : array) {
			System.out.print(r + " ");
		}
	}
	
}
