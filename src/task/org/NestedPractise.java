package task.org;

public class NestedPractise {
	
	public void nested() {
		
		for(int i = 1; i<=3 ;i++) {
				System.out.println(i);	
			
			for(int j =1; j<=3 ; j++) {
				System.out.println((i+j));
			}
		}
			
		
	}
	
	public void righthalfpyramid() {
		
		for (int i=1; i<=5; i++) {
			
			for (int j=1; j<=5; j++) {
				
				System.out.println(j+" ");
			}
			System.out.println();
		}
		}
	public static void main(String[] args) {
		NestedPractise obj = new NestedPractise();
		obj.nested();
		obj.righthalfpyramid();
		
				
	}
}
	
	
	


