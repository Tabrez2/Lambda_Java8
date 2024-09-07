package tutorial;

public class Hotel {
	public int pricePerNight;
	public int rating;
	public HotelType hotelType;
	
	public Hotel(int pricePerNight, int rating, HotelType hotelType) {
		super();
		this.pricePerNight = pricePerNight;
		this.rating = rating;
		this.hotelType = hotelType;
	}

	public int getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public HotelType getHotelType() {
		return hotelType;
	}

	public void setHotelType(HotelType hotelType) {
		this.hotelType = hotelType;
	}

	@Override
	public String toString() {
	    return String.format(
	        "------------------------------------\n" +
	        "| %-20s | %-10s |\n" +
	        "------------------------------------\n" +
	        "| %-20s | %-10d |\n" +  // %d for integers
	        "| %-20s | %-10d |\n" +  // %d for integers
	        "| %-20s | %-10s |\n" +  // %s for strings
	        "------------------------------------\n",
	        "Field", "Value",
	        "Price Per Night", pricePerNight,
	        "Rating", rating,
	        "Hotel Type", hotelType  // Assuming string
	    );
	}

		
}
