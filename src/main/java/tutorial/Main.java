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
	 
	 }
}
