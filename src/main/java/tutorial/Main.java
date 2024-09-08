package tutorial;

import java.util.List;

public class Main {

	 public static void main(String[] args) {
		
//		 HotelService hotelService = new HotelService();
//		 HotelType ht=HotelType.FIVE_STAR;
		//System.out.println(hotelService.filterHotelByPrice(4000)); 
//		System.out.println(hotelService.filterHotelByStarRating(ht)); 
	
	 HotelService hotelService = new HotelService();
	 
	 List<Hotel> hotelsByPrice=hotelService.filterHotels(new FilterHotelsLessThanPrice(6000));
	 System.out.println(hotelsByPrice);
	 
	 System.out.println("--------------------------------------------------------------");
	 
	 HotelType ht = HotelType.FIVE_STAR;

	 List<Hotel>hotels=hotelService.filterHotels(new FilterHotelByStarRating(ht));
	 System.out.println(hotels);
	 
/*Passing function in java
 * 
 * 1.create an interface
 * 2.instantiate a class  that implements the interface
 * 3.implement the method of the interfas=ce ,
 *   where the method body = function body which 
 *   you wanted to pass as parameter
 * 4.pass an object of the concrete implementation of the interface  
 * 
 */
	 
	 }
}
