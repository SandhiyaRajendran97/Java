package task.org;

public class ForLooptask {
	
	public void numbers () {
		for (int i=1; i<=10 ;i++) {
			System.out.println(i);
		}	
	}
	
	public void reverse () {
		for (int i=10; i>=0; i--) {
			System.out.println(i);
		}
	}
	 public void multiplication () {
		 for (int i=1; i<=10 ; i++) {
			 System.out.println(i+ "x2=" + i*2);
		 }
	 }
	
	
	
	public static void main(String[] args) {
		ForLooptask obj = new ForLooptask();
		
		obj.numbers();
		obj.reverse();
		obj.multiplication();
		
				
	}
}
