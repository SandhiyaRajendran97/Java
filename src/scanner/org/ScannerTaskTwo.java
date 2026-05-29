package scanner.org;

import java.util.Scanner;

public class ScannerTaskTwo {
	
	public void messagae() {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("userName: ");
	String wel = sc.next();
	
	System.out.println("Welcome "+wel);
	
			System.out.println("Enter the value of a :" );
	int a = sc.nextInt();
		System.out.println("Enter the value of b :" );
	int b = sc.nextInt();
		System.out.println("Enter the value of X :" + (a+b));
		
		System.out.println("enter the value :");
	int num = sc.nextInt();
 
	if(num % 2==0) {
		System.out.println("Even");
		}
		else {
	 System.out.println("odd");
		}
		
	System.out.print("enter the num1 value :");
	int num1 = sc.nextInt();
	
	System.out.print("enter the num2 value:");
	int num2 = sc.nextInt();
	
	int result = num1 * num2;
	System.out.println("Total value : "+ result);	
			
		System.out.println("Enter the value ");
		int above = sc.nextInt();
		 
		if(above == 0) {
			System.out.println();
			
		}
		
	}
	
	public void studentmark() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student mark :");
		
		int mark= sc.nextInt();
		
		if(mark>=90) {
			System.out.println("Grade A");
		}
			
		else if(mark>=70 && mark<=89){
				System.out.println("Grade B");
		}
				
	    else if(mark>=50 && mark<= 69){
	    	System.out.println("Grade c");
	    }
					
	    else {
	    	System.out.println("Fail");
	    }
		
	}
	
	public void largenum() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number :");		
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		
		if(num1> num2) {
			System.out.println("Num 1 is Large Number" + num1);			
		}
		else if (num2 >num1) {
			System.out.println("Num 2 is Small Number " + num2);
		}
		
		else {
			System.out.println("Both are equal");
		}		
	}
	
	public void vowels() {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Find the vowels: ");
		String word = sc.nextLine();
		
		int count = 0;
		
		for(int i =0; i< word.length(); i++) {
			char ch = Character.toLowerCase(word.charAt(i));	
		
		
		if(ch == 'A' || ch =='E' ||ch =='I' || ch =='O' || ch =='U') {
		
			count++;
			
		}
		}
		System.out.println("Number of Vowels : " + count);
		
	}
	
	public void reverse() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Reverse the string:");
		 String Name= sc.nextLine();
		 
		 for(int i= Name.length()-1; i >=0; i--) {
			System.out.print(Name.charAt(i)); 
		 }		 
	}
	
	public void ATM() {
		
		Scanner sc = new Scanner(System.in);		
		int balance = 5000;
		
		System.out.println("Enter the amount : ");
		int withdraw = sc.nextInt();
		
		if (withdraw <= balance) {
			
			balance = balance-withdraw;
			
			System.out.println("Remaining balance: "+ balance);
		}
		else {
			
			System.out.println("Insufficient balance");
		}
		
		
	}
	
	
public static void main(String[] args) {
	
	ScannerTaskTwo obj= new ScannerTaskTwo();
	obj.messagae();
	obj.studentmark();
	obj.largenum();
	obj.vowels();
	obj.reverse();
	obj.ATM();
	
}
}
