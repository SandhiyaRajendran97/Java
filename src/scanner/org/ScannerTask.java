package scanner.org;
import java.util.Scanner;

public class ScannerTask {
	
	
	
	public void maths() {
		Scanner sc = new Scanner (System.in);		
			
			System.out.println("Enter the value of a : ");
			int add = sc.nextInt();	
		
			System.out.println("Enter the value of b: ");
			int adds = sc.nextInt();
		
		
			System.out.println("Enter the total of A&B: "+ (add+adds));	
			
				
			System.out.println("Enter the value of a :");
			int sub = sc.nextInt();	
			
		
			System.out.println("Enter the value of b: ");
			int subs = sc.nextInt();
			
		
			System.out.println("Enter the value of A&B: "+ (sub-subs));
			
			
		
			System.out.println("Enter the value of a: ");
			int multi = sc.nextInt();
			
		
			System.out.println("Enter the value of b: ");
			int multis = sc.nextInt();
			
		
			System.out.println("Enter the value of A&B: "+(multi*multis));
			
			
		
			System.out.println("Enter the value of a ");
			int div = sc.nextInt();
		
		
			System.out.println("Enter the value of b ");
			int divide = sc.nextInt();
		
		
			System.out.println("Enter the value of A&B:100 "+ (div/divide));
		
		
			
	}
	
	
	public static void main(String[] args) {
		ScannerTask obj = new ScannerTask();
		
		obj.maths();
		
	}

}
