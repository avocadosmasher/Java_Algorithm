package SelectionSort;

import java.util.Scanner;
import SelectionSort.SelectionSortError;

public class SelectionSort {
	private static int ARRAY_SIZE_ERR = 0;
	private static int ARRAY_ELEMENTS_ERR = 1;
	
	
	public static void main(String arg[]) {
		int size = 0,temp =0;
		int[] array;
		Scanner sc = new Scanner(System.in);
		System.out.println("## ���α׷� ���� ##\n1.�Է��ϰ��� �ϴ� �迭�� ũ�� �Է�.\n2.�迭�� ��ҵ� �Է�\n");
		
		try {
			
			System.out.print("�迭�� ũ�� �Է� : ");
			size = sc.nextInt();
			
			if(size < 2) throw new SelectionSortError(ARRAY_SIZE_ERR);
			
		}catch(SelectionSortError e) {
			System.out.println(e.errMessage());
		}
		
		array = new int[size];
		
		System.out.print("�迭�� ��� �Է� : ");
		try {
			for(int i =0;i<size;i++) {
				temp = sc.nextInt();
				if(temp < 0) throw new SelectionSortError(ARRAY_ELEMENTS_ERR);
				array[i] = temp;
				
			}
		}catch(SelectionSortError e) {
			System.out.println(e.errMessage());
		}
		
		// ����.
		temp = 0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(array[j] < array[i]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		// ��� ���.
		StringBuffer sb = new StringBuffer();
		for(int r : array) {
			sb.append(r);
			sb.append(", ");
		}
		System.out.println(sb.toString());
		
		
	}
}
