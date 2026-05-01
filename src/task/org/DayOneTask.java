package task.org;

public class DayOneTask {
	
	public void declare() {
		
    	int sum = 2658;
		int add = 6589;
		
		int total = (sum+add);
		
		System.out.println("Total " + (total));
		
	}
		
	public void decided()	{
	
		double Sum=3265.5264;
		double Add=456.326;
		
		System.out.println("value of x: " + (Sum+Add));	
		
	}
	
	public void character() {
		
	
	
	char singleword = 's';
	

	System.out.println("Our Name: " + (singleword));
	
	}

	public void others () {
		
		boolean workspace = 2659 < 203;
		
		System.out.println("ans : "+(workspace));
		
		
	}
	
	
	public void circle () {
		
		double pi= 3.14;
		int radius =43;
		
		double area = pi* (radius*radius);
		
		System.out.println("circle of area " + (area));
		
		
	}
	
	
	public void calculation() {
		
		int add = 19;
		int sum = 56;
		
		System.out.println("value of sum " + (add+sum));
	}
	
	public void rectangle () {
		
		int length = 236;
		int breadth = 639;
		
		int totalarea = (length*breadth);
		
		System.out.println("total area of rec is  " + (totalarea));
		
	
	}
	
	public void bodyweight() {
		
		int kg = 56; // kgs
		double ht = 1.56; //meter 
		
		// given input in centimeter means convert to meter using  divided by 100
		
		double totalweight = kg/(ht*ht);
		
		System.out.println("total bodyweight : " + (totalweight));
	}
	
	
	
	
	public static void main(String[] args) {
		
		DayOneTask maths = new DayOneTask();
		
		maths.bodyweight();
		
		
		
	
		
		
	}

}
