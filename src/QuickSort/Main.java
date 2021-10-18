package QuickSort;

public class Main {
	private static int[] array = {1,10,5,8,7,6,4,3,2,9};
	
	public static void main(String arg[]) {
		System.out.println("Quick Sort Algorithm");
		
		// Sorting
		quickSorting(0,9);
		
		// Showing the output.
		print_result(array);
		
	}
	
	public static void quickSorting(int boundryL,int boundryR) {
		if(boundryL >= boundryR) return;
		
		// pivot == boundryL
		int pivot = array[boundryL];
		
		int i = boundryL+1, j = boundryR;
		
		while(i <= j) {
			while(i <= boundryR && array[i] <= pivot) i++;
			while(j > boundryL && array[j] >= pivot) j--;
			System.out.println("i °ª : " + i + ", j °ª : " + j);
			if(i > j) {
				int temp = array[j];
				array[j] = array[boundryL];
				array[boundryL] = temp;
			}else {
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
		quickSorting(boundryL,j-1);
		quickSorting(j+1,boundryR);
		
	}
	
	public static void print_result(int[] a) {
		StringBuffer sb = new StringBuffer();
		for(int r : a) {
			sb.append(r);
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}
