package task.org;

public class DayFourTask {
	
	public void Tipcalculator() {
		
		int price = 1000;
		int tipPercent=5;
		int people=2;
		int total = ((price * tipPercent)/100);
		System.out.println(total);	
		System.out.println((price+total)/people);
		
	}
	public void circumference() {
		
		int two = 2;
		double pi= 3.14;
		int r = 20;
		
		System.out.println(two*pi*r);
	}
	
	public void costcalculation() {
		int price = 1000;
	    int taxamt = price*18;
	    int amt = taxamt/100;
		int totalcost= price+amt;
		System.out.println(totalcost);		
	}
	
	public void averageofthreenumbers () {
		int one = 258;
		int two= 789;
		int three=741;
	    int total = (one*two*three)/3;
	    
	    System.out.println(total);
		
	}
	
public static void main(String[] args) {
	
	DayFourTask obj = new DayFourTask();
	obj.Tipcalculator();
	obj.circumference();
	obj.costcalculation();
	obj.averageofthreenumbers();
	
}
}
