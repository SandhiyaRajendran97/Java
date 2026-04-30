package task.org;

public class Variables {
	

//Variables
//
//1,  Variable Declaration
//2,  Variable initialization

	public void declare() {
		
		int a= 100;
		int b= 300;
		
		int c=a+b;
		
		System.out.println("value of c " + (c));
			
	}
	
	
	public static void main(String[] args) {
		
		Variables maths = new Variables();
		maths.declare();
	}

}
