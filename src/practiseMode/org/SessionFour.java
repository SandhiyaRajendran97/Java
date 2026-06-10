package practiseMode.org;

public class SessionFour implements SessionThree{
	

    @Override     
   	public void acNo(){
System.out.println("1234567890");
}
@Override 
public void name(){
System.out.println("sandhiya");
}


@Override 
public void ifsc(){
System.out.println(5678);
}

@Override 	
public void pin(){
System.out.println(2345);	
}


public static void main(String[]args){

	SessionFour obj = new SessionFour();
		obj.acNo();
		obj.name();
		obj.ifsc();
		obj.pin();

}

}
