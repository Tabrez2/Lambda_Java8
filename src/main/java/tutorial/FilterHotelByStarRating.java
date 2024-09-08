package tutorial;

public class FilterHotelByStarRating implements FilteringCondition {
	
	HotelType hotelType;
	
	public FilterHotelByStarRating(HotelType hotelType) {
		
		this.hotelType=hotelType;
		
	}
	

	@Override
	public boolean test(Hotel hotel) {
		return hotel.getHotelType()==hotelType;
	}
	
	

}
