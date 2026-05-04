package partialAbstraction.org;

public class Details extends Mobiledata {
	
	public void storage() {
		
		System.out.println("company name :8gb ram");
	}
	
	public void gallery () {
		System.out.println("photos of phone:secret");
		
	
	}
	
	public static void main(String[] args) {
		
		Details object = new Details();
		object.filemanager();
		object.contacts();
		object.storage();
		object.gallery();
		
		
		
	}

}
