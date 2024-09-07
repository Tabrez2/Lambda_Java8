package tutorial;

public class Main {

	 public static void main(String[] args) {
		
		 HotelService hotelService = new HotelService();
		 HotelType ht=HotelType.FIVE_STAR;
		//System.out.println(hotelService.filterHotelByPrice(4000)); 
		System.out.println(hotelService.filterHotelByStarRating(ht)); 
	}
}
