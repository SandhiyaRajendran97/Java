package swithcCondition.org;

public class Switchmethod {
	
	public void Dayfinder() {
		
		int Days=3;
		
		switch(Days) {	
		case 1:
			System.out.println("Monday");
		    break;		
		case 2:
			System.out.println("Tuesday");
		    break;		
		case 3:
			System.out.println("Wednesday");
			break;		
		case 4 :
			System.out.println("Thursday");
			break;		
		case 5:
			System.out.println("Friday");
			break;		
		case 6:
			System.out.println("Saturday");
			break;
		case 7 :
			System.out.println("Sunday");
			break;
		}	
	}		
	public void Monthfinder () {
		String month = "January";	
		switch(1) {
		case 1 :
			System.out.println("January");
			break;	
		case 2 :
			System.out.println("February");
			break;
		case 3 :
			System.out.println("march");
			break;
		case 4 :
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8 :
			System.out.println("August");
			break;
		case 9 :
			System.out.println("september");
			break;
		case 10:
			System.out.println("october");
			break;
		case 11:
			System.out.println("november");
			break;
		case 12:
			System.out.println("December");
			break;
		}			
		}	
	
	
	public void trafficsignal() {
		
	    String red = "red";
		String yellow = "Yellow";
		String green = "Green";
		
		switch (red) {
		
		case "red" :
			System.out.println("stop");
			break;
		case "Yellow":
			System.out.println("get ready");
			break;
		case "Green":
			System.out.println("stop");	
			break;
			
		default :
				System.out.println("above mention color is not valuable");
		}
	
	}
	public void simplecalculator() {
		
		int numbers = 200;
		int operators = 300;
		int total = 400;
		
		switch (numbers) {
		
		case 100,300,400:
			System.out.println("its an operator");
			break;
		default:
			System.out.println("its not an operator");
		}
	}
		
	public void Vowelchecker () {
			 char ch='a';
			 
			 switch (ch) {
			 
			 case 'a','e','i','o','u':
				 System.out.println("its an vowel");
			 	break;
			 default:
				 System.out.println("its not an vowel");
			
		}
	
	}
	
public static void main(String[] args) {
	Switchmethod obj =new Switchmethod (); 
	obj.Dayfinder();
	obj.Monthfinder();
	obj.trafficsignal();
	obj.simplecalculator();
	obj.Vowelchecker();
	
}
}
