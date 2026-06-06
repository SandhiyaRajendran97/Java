package variableTask;

public class TaskTwo {
	
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
public static void main(String[] args) {
	TaskTwo obj = new TaskTwo();
	obj.studentdetails();

}
}