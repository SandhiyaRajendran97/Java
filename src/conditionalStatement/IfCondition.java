package conditionalStatement;


public class IfCondition {
	
public void tollgate() {
		
		int car = 100;
		
		if( car >=100) {
			System.out.println("you can go");
		}
			
			else {
				System.out.println("Please pay and go");
			}
	}
		
	
	public void subjects () {
		
		int english = 56;
		int tamil = 78;
		int maths = 89;
		int science = 93;
		int social= 65;
		
		int totalmarks = (english+tamil+maths+science+social);
		System.out.println("Total marks is "+ totalmarks);
		
		
		double percent = ((totalmarks/500.0)*100);
		System.out.println("Total Percentage is " + percent);
		
		int percentage = 87;
		 
		if (percentage >=1 && percentage <=100) {
			System.out.println("when your percentage is: "+ percentage);
			
			if (percentage >=91 ) {
				System.out.println("Rank is 1st");
			}
				
				else if (percentage >=81 && percentage <=90) {
					System.out.println("Rank is 2nd");
				
			}
				else if (percentage >=71 && percentage <=80) {
					System.out.println("Rank is 3rd");
					
				}
		        
				else if (percentage >= 61 && percentage <=70) {
					System.out.println("Rank is 4th");
				}
		
				else if (percentage >=51 && percentage <=60) {
					System.out.println("Rank is 3rd");
				}
		 
				else if ( percentage >=41 && percentage <=50) {
					System.out.println("Rank is 4th");
				}
			
				else if (percentage >=31 && percentage <=40) {
					System.out.println("Rank is 5th");
				}
			
				else {
					System.out.println("Fail");
				}
		}			
	}
		
		public static void main(String[] args) {
			
			IfCondition obj = new IfCondition();
			
			obj.tollgate();
			obj.subjects();
			
		}
				
	}
