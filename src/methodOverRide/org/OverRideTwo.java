package methodOverRide.org;

public class OverRideTwo extends OverRide{
    @Override
	public void dress () {
		System.out.println("Kurtha Price :5000 ");
	}
    @Override
	public void slippers () {
		System.out.println("Slippers Price: 2000");
	}
	@Override
		public void accessories() {
			System.out.println("Access Price: 4000");
		}
     @Override
		public void facecream() {
				System.out.println("Facecream : 700");
		}
	

public static void main(String[] args) {
	OverRideTwo obj= new OverRideTwo ();
	obj.dress();
	obj.slippers();
	obj.accessories();
	obj.facecream();
	
	
}


}
