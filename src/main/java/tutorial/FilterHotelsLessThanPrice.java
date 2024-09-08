package tutorial;

public class FilterHotelsLessThanPrice implements FilteringCondition {
   
	int price;
	
	public FilterHotelsLessThanPrice(int  price) {
        this.price=price;
	}
	
	@Override
	public boolean test(Hotel hotel) {
		return hotel.getPricePerNight()<=price;
		
	}

}
