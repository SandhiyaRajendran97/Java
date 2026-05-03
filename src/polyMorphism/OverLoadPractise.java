package polyMorphism;

public class OverLoadPractise extends MethodOverloadingPolymorphism {
	public void kitchen(int noofroominhouse){
		System.out.println("No of room in house : " + noofroominhouse);
	}
	
		public void kitchen (int drykitchen, int wetkitchen ) {
			System.out.println("No of kitchen: "+ drykitchen);
			System.out.println("No of kitchen: " + wetkitchen);
		}
		
		
		
	
	
	
	public static void main(String[] args) {
		OverLoadPractise obj=new OverLoadPractise();
		
	
		
		
		obj.kitchen(5);
		obj.cooking(56);
		obj.cooking(2, 5, "four");
		obj.kitchen(5, 80);
		
		
	}

}
