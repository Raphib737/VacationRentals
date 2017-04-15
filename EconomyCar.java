package vacationRentals;

import java.util.*;

/**
 *  EconomyCar class is a Vehicle with
 * 	BaseRate: 50% less than MidsizeCar
 * The class constructor will take in as its parameters the
 * start date and end date to calculate the total price. 
 */
public class EconomyCar extends Vehicle{
	public EconomyCar(Calendar startDate, Calendar endDate) {
		super("economy car", startDate, endDate);
		setBaseRate(super.getBaseRate()/2);
		setDayPrices();
		setTotalPrice();
	}

}
