import java.util.*;

/**
 * MidSizeCar class is a Vehicle with
 * 	BaseRate: 30/day
 * 	Premium: 125% from original
 * 	Discounted: 80% from original
 * The class constructor will take in as its parameters the
 * start date and end date to calculate the total price. 
 */
public class MidSizeCar extends Vehicle {
	public MidSizeCar(Calendar startDate, Calendar endDate) {
		super("midsize car",startDate,endDate);
		setDayPrices();
		setTotalPrice();
	}

}
