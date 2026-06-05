package loopsconcept.org;



public class WhileLoopPractise {
	
	public void reverse() {
		
		String name= "sandhiya";
		
		int i=name.length()-1;
		
		while( i>=0) {
			
			System.out.print(name.charAt(i));
			
			i--;			
		}
	}
	
	public void polindrome() {
		
		String txt ="amma";
		
		int i= txt.length()-1;
		
		while(i>=0) {
			System.out.print(txt.charAt(i));
			
			i--;
		}
	}
public static void main(String[] args) {
	
	WhileLoopPractise obj = new WhileLoopPractise();
	//obj.reverse();
	obj.polindrome();
}
}


