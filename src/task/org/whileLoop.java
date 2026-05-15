package task.org;

public class whileLoop {
	
	public void numbers() {
		int i=1;
		while(i<=10){
			System.out.println(i);
			i++;
		}
}
	public void evenNumber() {
		int j=1;
		
		while(j<=30){
			if(j%2 ==0) {
			System.out.println(j);
		}
			j++;
		}
	}
	
	public void sumoffivenumbers() {
		int i=0;
		int j=1;	
		while(j<=5) {
			i=i+j;
			j++;
		}
		System.out.println(i);
	}
	
	public void reverse() {
		int i=10;
		while(i>=1) {
		System.out.println(i);
		i--;
		}
		
	}
	
	public void multiplication() {
		int i=1;
		
		while(i<=10) {
			System.out.println(i+"x 2 = "+ (i*2));
			i++;
			
		}
	}
	
	
	
public static void main(String[] args) {
  whileLoop obj = new whileLoop();
  //obj.numbers();
  //obj.evenNumber();
  //obj.sumoffivenumbers();
  //obj.reverse();
  //obj.multiplication();
  
}
}
