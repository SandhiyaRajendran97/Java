package variableTask;

public class TaskOne {
	
	public void names() {
		String name ="sandhiya";
		
		System.out.println("my name is "+ name);
	}

	public void age () {
		int age = 22;
		
		System.out.println("i am " + age + " years old");
	}
	
	public void sum() {
		int num1  = 567;
		int num2 =678;
		 int total = num1+num2;
		 
		 System.out.println(total);
		
	}
	
	public void rectangle() {
		
		int length = 123;
		int width = 234;
		
		int area= length*width;
		 System.out.println(area);
		
	}
	
	public void swap() {
		
		int a = 20;
		int b = 40;
		
		int temp = a;
		a= b;
		b=temp;
		
		System.out.println("the value of a:" + a);
		System.out.println("the value of b: "+b);
	}
	
	public void studentdetails() {
		
		String name = "sandhiya";
		int rollNo =5212;
		char section = 'A';
		
		int english =56;
		int tamil= 67;
		int maths =89;
		int science = 78;
		int social = 87;
		
		int total =english+ tamil+maths+science+ social;
		
		double percentage = (total/500.0)*100;
		
		
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(section);
		System.out.println(percentage + "%");	
		
	}
	
	public void temperature() {
		
		int celcius = 40;
		
		int fahrenheit = (40*9/5) +32;
		
		System.out.println(fahrenheit);
	}
	
	public static void main(String[] args) {
		TaskOne obj = new TaskOne();
		//obj.names();
		//obj.age();
		//obj.sum();
		//obj.rectangle();
		//obj.swap();
		//obj.studentdetails();
		obj.temperature();
	}
	
	
	
	
}







