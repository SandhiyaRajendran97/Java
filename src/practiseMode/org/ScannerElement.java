package practiseMode.org;

import java.util.Scanner;

public class ScannerElement {
	
	public void elements() {
	
		  Scanner sc = new Scanner(System.in);
		  
		 System.out.print("Enter array size: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.println("Array elements are:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        
	}
	
	public static void main(String[] args) {
		
		ScannerElement obj = new ScannerElement();
		obj.elements();
		
	
}
}
