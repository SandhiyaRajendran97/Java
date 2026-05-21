package task.org;

public class Loops {
	
	public void stringvalue() {
		
	String Name="sandhiya";
	System.out.println("before reverse: "+ Name);
	
	String dummy ="";
	
	for(int i = Name.length()-1; i>=0; i--) {
		
		dummy= dummy + Name.charAt(i);
		
	}
	
		System.out.println("After reverse: "+ dummy);
	}
	public void chennai() {
		String ans = "guindy";
			System.out.println("before " + ans);
		
		String NULL = "";
		
		for(int i= ans.length()-1; i>=0; i--) {
			NULL=NULL + ans.charAt(i);
			System.out.println("After " + NULL);
		}
		
		System.out.println("After " + NULL);
	}
	public void palindrome() {
		String Word = "earth";
		System.out.println("before "+ Word);
		
		String nulls = "";
		
		for(int i=Word.length()-1; i>=0; i--) {
			nulls = nulls + Word.charAt(i);
			
		}		
		System.out.println("after "+ nulls);
		
		if(Word.equalsIgnoreCase(nulls)) {
			System.out.println("it is palindrome");
			}
		else {
			System.out.println("it is not palindrome");
			
		}
	}
	public void stringTxt() {
		String collage = "velammal";
		
		System.out.println(collage);
		
		String Dummy = "";
		
		for (int i=0; i<=collage.length()-1; i++) {
			
			Dummy= Dummy+collage.charAt(i);
			
			System.out.println(Dummy);			
		}
			}	
	
	public void vowels() {
		String Degree ="engineering";		
		int vowel=0;
		
		for(int i =0; i<=Degree.length()-1; i++) {
			
		char ch = Degree.charAt(i);
		
			if( ch =='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
		
				vowel = vowel +1;
			}
		}
		System.out.println(vowel);
	}
			
	public static void main(String[] args) {
		Loops obj=new Loops();
		//obj.stringvalue();
		//obj.chennai();
		//obj.palindrome();
		obj.stringTxt();	
		//obj.anagram();
		obj.vowels();
		
	
		}
}
	
	

