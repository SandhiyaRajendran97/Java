package polyMorphism;

public class MethodOverloadingPolymorphism {

	public void cooking (int chillipowder){
		
		System.out.println("Tablespoon: " + chillipowder );	
	}
	
	public void cooking (int garammasala, int noofspoon) {
		System.out.println("Tablespoon: " + garammasala);
		System.out.println("Tablespoon: " + noofspoon);
		
	}
	
	public void cooking (int cummin, int salt, String starchpowder) {
		System.out.println("Tablespoon: " + cummin);
		System.out.println("Tablespoon: " + salt);
        System.out.println("Tablespoon: " + starchpowder);		
		
	}
	public static void main(String[] args) {
		
		MethodOverloadingPolymorphism obj =new MethodOverloadingPolymorphism();
		
		obj.cooking(2);
		obj.cooking(3);
		obj.cooking(5);
		obj.cooking(4, 5, "Fourspoon");
		
		
		
		
	}
	{
		
		
		
		
		
		
	}
}
