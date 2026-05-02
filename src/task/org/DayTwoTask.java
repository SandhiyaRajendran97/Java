package task.org;

public class DayTwoTask {
	
	
	public void swap() {
	
	int A=100;
	int B=200;
	
//	int temp = A;
//	    A=B;
//	    B=temp;
//	    
//	    System.out.println(A);
//	    System.out.println(B);
//	    System.out.println(temp);
	
	A = A + B;
	B = A - B;
	A = A - B;
	
	System.out.println(A);
	System.out.println(B);
	System.out.println(A);
	
	}
	
	
	public void simpleInterest () {
		
		int principle = 5000;
		int intrestrate =5;
		int time = 2;
		
		int rate = (principle* intrestrate*time)/100;
		
		System.out.println("simple "+ (rate));
	}
	
	
	
	public void temperature() {
		
		int farenheat= 10;
		int celcius=20;
		
	int temp =(celcius*9/5)+32;
	
	System.out.println(temp);
	
		
		
	}
	
	public void productoftwonumbers() {
		
		float one = 23.56f;
		float two = 26.36f;
		
		float numbers = (one*two);
		
		System.out.println(numbers);
	}
	
	
	public void perimeter () {
		
		int P= 4;
		int A = 50;
		
		String squareperimeter = ("Square "+ (4*A));
		
		System.out.println(squareperimeter);
		
		
	}
	
	
	public static void main(String[] args) {
		
		DayTwoTask obj = new DayTwoTask();
		
		obj.perimeter();
		obj.productoftwonumbers();
		obj.temperature();
		obj.simpleInterest();
		obj.swap();
			
	}

}
