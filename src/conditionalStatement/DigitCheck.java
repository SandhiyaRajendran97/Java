package conditionalStatement;

public class DigitCheck {
	
	public void checking() {

        int num = 456;

        if (num >= 10 && num <= 99) {
            System.out.println(num + " is a 2-digit number");
        } else if (num >= 100 && num <= 999) {
            System.out.println(num + " is a 3-digit number");
        } else if (num >= 1000 && num <= 9999) {
            System.out.println(num + " is a 4-digit number");
        } else {
            System.out.println(num + " is not a 2, 3, or 4-digit number");
        }
        
	}

    public static void main(String[] args) {
    	
    	DigitCheck obj  =new DigitCheck();
    	
    	obj.checking();
    }
    
}	
