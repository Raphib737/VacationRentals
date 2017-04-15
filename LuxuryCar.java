/**
 * 
 */
package vacationRentals;

import java.util.Calendar;

/**
 *  LuxuryCar class is a Vehicle with
 * 	BaseRate: 100% more than the MidSize Vehicle
 * The class constructor will take in as its parameters the
 * start date and end date to calculate the total price. 
 */
public class LuxuryCar extends Vehicle{
	public LuxuryCar(Calendar startDate, Calendar endDate) {
		super("luxury car", startDate, endDate);
		setBaseRate(super.getBaseRate()*2);
		setDayPrices();
		setTotalPrice();
	}

}
