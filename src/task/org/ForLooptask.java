package task.org;

public class ForloopTask {
	
	public void numbers () {
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			
		}
		
	}
	
	public void evenNmuber() {
		for(int i=1; i<=30; i++) {
			if(i %2 ==0)
			System.out.println(i);
			
		}
	}
	
	public void sumoffivenumbers() {
		int j=0;
		
		for(int i=1; i<=5; i++) {
			
			j=j+i;
		}
			System.out.println(j);
			}
		
	public void reverse() {
		
		for(int i= 10; i>=1;i--) {
			System.out.println(i);
			
		}
	}
	
	public void multiplication() {
		
		for(int i=1; i<=10; i++) {
		System.out.println(i+" x 2 = "+ (i*2));
		}
	}
	
	public void factorial() {
		
		int j=1;
		for(int i=5; i>=1; i--) {
			j=j*i;
			System.out.println(j);
		}
			
		}
	
public static void main(String[] args) {
	ForloopTask obj = new ForloopTask();
	//obj.numbers();
	//obj.evenNmuber();
	//obj.sumoffivenumbers();
    //obj.reverse();
	//obj.multiplication();	
	//obj.factorial();
	
	
}
}
