package tutorial1;

public class Lambdas {

	public static void main(String[] args) {

//		printThings(()->  System.out.println("meow"));
		
//		Printable lambdaExp = ((p, s)->System.out.println(p+" Meowing "+s));	
//		printThings(lambdaExp);
		
		Printable lambdaExp = ((s)-> {
			System.out.println(" !!! "+s);
			return "meow "+s;
		});
		
		printThings(lambdaExp);
	
				
	}
	
	public static void printThings(Printable things) {
//		things.print("CatIs","!");
		
		things.print("!!!");
		
	}

}
