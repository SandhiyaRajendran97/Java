package practiseMode.org;

public class sessionOne extends sessionTwo {
	
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
sessionOne obj = new sessionOne();
obj.english();
obj.tamil();
obj.maths();
obj.science();
obj.social();

}


}
