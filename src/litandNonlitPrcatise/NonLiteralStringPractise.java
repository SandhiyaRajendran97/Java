package litandNonlitPrcatise;

public class NonLiteralStringPractise {
	
	public void Nonliteral() {
		
		String greet1 = new String ("welcome");
		String greet2 = new String ("WELCOME");
		String greet3 = new String("welcome");
		
		int idOne = System.identityHashCode(greet1);
		int idTwo = System.identityHashCode(greet2);
		int idThree = System.identityHashCode(greet3);
		
		System.out.println(idOne);
		System.out.println(idTwo);
		System.out.println(idThree);

		String One = greet1.concat("Java");
		System.out.println("One");
		
		int idForOne = System.identityHashCode(One);
		System.out.println(idForOne);
		
		System.out.println(greet1 == greet2);
		System.out.println(greet2 == greet3);
		System.out.println(greet3 == greet1);
	}
public static void main(String[] args) {
	NonLiteralStringPractise obj = new NonLiteralStringPractise();
	obj.Nonliteral();
	
}
}
