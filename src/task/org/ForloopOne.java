package task.org;

public class ForloopOne {
	
	public void increment () {
		for (int i =20; i<=30; i++) {
			System.out.println(i);
			
		}
	}
	
	public void postincrement () {
		for (int i = 30; i>20; i--) {
			System.out.println(i);
		}
	}
 
	public static void main(String[] args) {
		ForloopOne obj=new ForloopOne();
		obj.increment();
		obj.postincrement();
		
	}

}	
