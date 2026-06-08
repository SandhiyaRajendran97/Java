package variableTask;
	
	public class TaskFoura extends TaskFour {
		
		@Override
		public void english(){
			System.out.println("Fail");
		}
	 @Override
		public void tamil(){
	System.out.println("fail");
	}

	@Override
	public void maths(){
	System.out.println("fail");
	}
	@Override
	public void science(){
	System.out.println("fail");
	}
	@Override
	public void social(){
		System.out.println("fail");
	}

	public static void main(String[]args){
		
	TaskFoura obj = new TaskFoura ();
	obj.english();
	obj.tamil();
	obj.maths();
	obj.science();
	obj.social();

	}
	}


