package InsertionSort;

public class Main {
	public static void main(String arg[]) {
		int[] array = {1,10,5,8,7,6,4,3,2,9};
		int size = array.length;
		
		for(int i=0;i<size-1;i++) {
			boolean check = true;
			for(int j = i;check;j--) {
				if(array[j] > array[j+1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}else {
					check = false;
				}
			}
		}
		
		for(int r : array) {
			System.out.print(r + " ");
		}
		System.out.print("\n");
		
		
	}
}
