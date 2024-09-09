package tutorial2;

public class AnonymousInnerClasses {

	public static void main(String[] args) {
		
//		new Animal().makeNoise(); Yap yap yap !!
		
		Animal myAnimal = new Animal();
		myAnimal.makeNoise();
		
		Animal bigFoot = new Animal() {
			@Override
			public void makeNoise() {
				System.out.println("Grawwwww !!");
			}		
		};
		bigFoot.makeNoise();
	
		Runnable myAnonymousRunnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("I am an Anonymous runnable");
			}
		};
		myAnonymousRunnable.run();

		
	}

}
