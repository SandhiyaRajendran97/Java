package practiseMode.org;

public class Element {
	
	public void elements() {

    int[] arr = {10, 25, 45, 12, 30, 45};

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : arr) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num != largest) {
            secondLargest = num;
        }
    }

    System.out.println("Largest Element: " + largest);
    System.out.println("Second Largest Element: " + secondLargest);
}
	
	public static void main(String[] args) {
		
		Element obj = new Element();
		
		obj.elements();
		
		
	}
}


