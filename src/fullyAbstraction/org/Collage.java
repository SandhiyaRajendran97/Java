package fullyAbstraction.org;

public class Collage implements School {
	@Override
	public void sectionA () {
		
		System.out.println("section A has 2 members");
	}
	@Override
	public void sectionB () {
		System.out.println("section B has 3 members");
	}
	@Override
	public void sectionC () {
		System.out.println("section C has 4 members");
	
	}
	@Override
	public void sectionD () {
		System.out.println("section D has 5 members");
		
	}
	
	
	public static void main(String[] args) {
		Collage object =new Collage();
		object.sectionA();
		object.sectionB();
		object.sectionC();
		object.sectionD();
		
	}

}
