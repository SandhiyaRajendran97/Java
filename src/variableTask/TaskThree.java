package variableTask;

public class TaskThree {

		public void palindrome(){
			String name = "Amma";
			String reverse= "";
		
			for(int i = name.length()-1; i>=0; i--){
				reverse = reverse +name.charAt(i);
			}
	if(name.equalsIgnoreCase(reverse)){
	System.out.println("Palindrome");
	}else{
	System.out.println("its not palindrome");
	}
	}

	public void reverse(){
				String word = "sandhiya";
				String rev= "";

			for(int i = word.length()-1; i>=0; i--){
				rev= rev+word.charAt(i);

		    System.out.println(rev);
		}
		}
	
	public void numbers(){
		int a = 29;
		int b = 50;
		int c = 65;

	if(a >=b && a>=c){
	System.out.println("largest number:" +a);
	}
	else if(b>=a && b>=c){
	System.out.println("largest number:" +b);
	}
	else{
	System.out.println("Largest number :"+c);
	}
	}
	public void methods(int a,int b){
		System.out.println(a+b);
		}
		public void methods(int a, int b, int c){
		System.out.println(a+b+c);
		}
		public void methods(String name, int a, int b, int c){
		System.out.println(a+b+c+ (name));
		}


	public static void main(String[] args){
	TaskThree obj = new TaskThree();
	obj.palindrome();
	obj.reverse();
	obj.numbers();
	obj.methods(200,300);
	obj.methods(200,300,400);
	obj.methods(" sandhiya" , 200,300,400);



	}
	}



