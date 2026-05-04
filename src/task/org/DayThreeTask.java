package task.org;

public class DayThreeTask {
	
	public void addition () {
		int add =256;
		int adds = 5698;	
		System.out.println("value of addition:" +(add+adds) );	
	
	}
	
	public void subtration () {
		
		int sub = 569;
		int subs = 659;
	
		System.out.println("value of subtraction :" + (sub-subs));
		
	}
	
	public void multiply () {
		int multi = 6598;
		int multis = 5698;
		
		System.out.println("value of multiplication:" + (multi*multis));
	}
	
	public void divide () {
		int div = 23;
		int divide = 236;
		
		System.out.println("value of division: " + (div/divide));
		
	}
	
	public void modulusOperator () {
		int model = 236;
		int operate = 12;
		
		System.out.println("value of modulus: " + (model % operate));
		
	}
	
	public void meterstokilometers () {
		
		double meter = 2563;
	    double kilometer = meter/1000;
		
		
		System.out.println("value of kilometer : " +(kilometer));
		
	}
	
	public void currency () {
		
		int inr = 94;
		int usd = 23;
		
		System.out.println("amount of money: "+ (inr*usd));
	}
	
	public static void main(String[] args) {
		
		DayThreeTask obj = new DayThreeTask();
		obj.addition();
		obj.subtration();
		obj.multiply();
		obj.divide();
		obj.modulusOperator();
		obj.meterstokilometers();
		obj.currency();
		
		
		
		
		
			
		}
			
			
			
		
		
		

	
	}


