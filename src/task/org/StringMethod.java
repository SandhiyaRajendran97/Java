package task.org;

public class StringMethod {
	
	public void upperclass() {
		
		String Name= "sandhiya";
		System.out.println(Name.toUpperCase());	
	}
	
	public void Lowerclass () {
		String name ="SANDHIYA";
		System.out.println(name.toLowerCase());
		
	}
	
	public void length () {
		String Name= "Linga";
		System.out.println(Name.length());
	}
	
	public void indexstring () {
		String Name= "Lingeshwaran";
		System.out.println(Name.indexOf("g"));	
	}
	
	public void Lastindexof () {
		String Name = "Linga";
		System.out.println(Name.lastIndexOf("g"));
	}
	
	public void chartmethod() {
		String name = "sandhiya";
		char found = name.charAt(4);
			System.out.println("find a 8th index is: "+ found);
							
	}
	
	public void concatstring () {
		String first = "hello";
		String second = "world";
		String concating = first.concat(second);
			System.out.println("after concat : " + concating);			
	}
	
	public void containmethod() {
		String movie = "tamil cinema from kollywood";
			boolean cine = movie.contains("tamil");
			 System.out.println("find contains : "+ cine);
	}
	
public void startWith() {
		
		String name = "sandhiya";
		
			boolean find = name.startsWith("an");
			
				System.out.println("startWith : " + find);
	}
	public void endWith() {
		
		String name = "sandhiya";
		
			boolean find = name.endsWith("san");
			
				System.out.println("startWith : " + find);
	}
	public void equalIgnore() {
		
		String name = "sandhiya";
		String namie = "SANDHIYA";
			
			
				System.out.println("startWith : " + name.equalsIgnoreCase(namie) );
	}
	
public static void main(String[] args) {
	
	StringMethod obj =new StringMethod ();
	obj.chartmethod();
	obj.concatstring();
	obj.containmethod();
	obj.startWith();
	obj.endWith();
	obj.equalIgnore();
	
	
}
}
