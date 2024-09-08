package tutorial;

import java.util.List;

public class Main {

	 public static void main(String[] args) {
		
//		 HotelService hotelService = new HotelService();
//		 HotelType ht=HotelType.FIVE_STAR;
		//System.out.println(hotelService.filterHotelByPrice(4000)); 
//		System.out.println(hotelService.filterHotelByStarRating(ht)); 
	
//		 HotelService hotelService = new HotelService();
//		 int price = 6000;  // Ensure price is not modified
//
//		 List<Hotel> hotelsByPrice = hotelService.filterHotels(new FilteringCondition() {
//		     @Override
//		     public boolean test(Hotel hotel) {
//		         return hotel.getPricePerNight() <= price;
//		     }
//		 });
		 
    	 HotelService hotelService = new HotelService();
		 int price=2000;
     	 List<Hotel> hotelsByPrice = hotelService.filterHotels((Hotel hotel)->{//here using lambda exp
     		 return hotel.getPricePerNight()<=price;
     	 });
		 System.out.println(hotelsByPrice);
		 
System.out.println("--------------------------------------------------------------------------------------------------");
	 
//	 HotelType ht = HotelType.FIVE_STAR;
//
//	 List<Hotel>hotels=hotelService.filterHotels(new  FilteringCondition() {
//		
//
//			@Override
//			public boolean test(Hotel hotel) {
//				return hotel.getHotelType()==ht;
//			}
//			
//	 });
//	 System.out.println(hotels);
HotelType ht = HotelType.THREE_STAR;

List<Hotel>hotels=hotelService.filterHotels((Hotel hotel)-> {//here using lambda exp
		return hotel.getHotelType()==ht;		
});
System.out.println(hotels);

	 
/*Passing function in java
 * 
 * 1.create an interface
 * 2.instantiate a class  that implements the interface
 * 3.implement the method of the interface ,
 *   where the method body = function body which 
 *   you wanted to pass as parameter
 * 4.pass an object of the concrete implementation of the interface  
 * 
 */
	 
	 }
}
