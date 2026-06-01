package litandNonlitPrcatise;

public class LiteralStringPractise {
	
	public void literal() {
		
		String greet1 ="Welcome";
		String greet2 = "WELCOME";
		String greet3 = "WelCome";
		
		int firststID = System.identityHashCode(greet1);
		int secondndID = System.identityHashCode(greet2);
		int thirdID = System.identityHashCode(greet3);
		
		System.out.println("ist id for greet1: "+ firststID);
		System.out.println("Second id for greet2: "+ secondndID);
		System.out.println("Third id for greet3: "+ thirdID);
		
		String one = greet1.concat("Java");
			System.out.println("one :"+ one);
		int idforOne = System.identityHashCode(one);
			System.out.println("id for one: " + idforOne);
			
			System.out.println(greet1==greet2);
			System.out.println(greet2==greet3);
			System.out.println(greet3==greet1);		
		
	}
public static void main(String[] args) {
	LiteralStringPractise obj = new LiteralStringPractise();
	obj.literal();
}
}
