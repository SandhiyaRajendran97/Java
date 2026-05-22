package array.org;

public class ArraysPractise {
	
	public void many() {
		
		int [] numbers = {1,2,3,4,5,6};
		System.out.println(numbers[5]);
	
	
	for(int i =0; i < numbers.length; i++) {
		System.out.println(numbers[i]);
	}
		
}
	public void arrays() {
		int []odd = new int[5];
		
		odd[0]=10;
		odd[1]=20;
		odd[2]=30;
		odd[3]=40; 
		odd[4]=50;
		
		for (int i=0; i< odd.length; i++) {
			System.out.println(odd[i]);
			
		}
	}
	public void string() {
		String[] names = {"sandy", "jai", "rekha","sushi"};
		
		for(int i = 0 ; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
	}
	public void star() {
		
		String [] even = new String[4];
		
		even[0] = "sandy";
		even[1] = "jai";
		even[2] = "rekha";
		even[3] = "sushi";
		
		for(int i = 0 ; i < even.length; i++) {
			System.out.println(even[i]);
		}		
	}
	
public static void main(String[] args) {
	ArraysPractise obj = new ArraysPractise();
	//obj.many();
	//obj.arrays();
	//obj.arrays();
	obj.star();
	
}
}
