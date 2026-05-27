package accessspecifier.org;

public class Private {
	
	private void sub() {
		System.out.println(35 - 20);

	}
	
	
	
	public static void main(String[] args) {
		
		Private obj = new Private();
		
		obj.sub();

	}

}


