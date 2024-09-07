package tutorial;

import java.util.ArrayList;
import java.util.List;

public class HotelService {

	List<Hotel> listOfHotels =new ArrayList();

	public HotelService() {
		
		listOfHotels.add(new Hotel(2000, 2, HotelType.FIVE_STAR));
		listOfHotels.add(new Hotel(4000, 1, HotelType.THREE_STAR));
		listOfHotels.add(new Hotel(6000, 3, HotelType.FIVE_STAR));
		listOfHotels.add(new Hotel(8000, 5, HotelType.FIVE_STAR));
		listOfHotels.add(new Hotel(2000, 4, HotelType.FOUR_STAR));
		listOfHotels.add(new Hotel(2000, 4, HotelType.THREE_STAR));
		
		
	}
	
	private boolean isHotelLessThan(int price, Hotel hotel) {
	     return hotel.getPricePerNight()<=price;
	}
	
	public List<Hotel> filterHotelByPrice(int price) {
		List<Hotel> filteredHotels = new ArrayList<Hotel>();
		
		for(Hotel hotel:listOfHotels) {
			if(isHotelLessThan(price,hotel))
			    filteredHotels.add(hotel);
		}
		
		return filteredHotels;
	}
	
	private boolean isHotelStarRating(HotelType hotelType, Hotel hotel) {
		return hotel.getHotelType()==hotelType;
	}

	
	public List<Hotel> filterHotelByStarRating(HotelType hotelType) {
		
		List<Hotel>filteredHotels = new ArrayList<Hotel>();
		
		for(Hotel hotel : listOfHotels) {
			if(isHotelStarRating(hotelType,hotel))
				filteredHotels.add(hotel);
		}
		
		return filteredHotels;
		
	}

	
	
	
}




















