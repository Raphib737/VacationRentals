import java.util.*;

/*
 * Bicycle class which is a Vehicle with
 * BaseRate: 10/day
 * The class constructor will take in as its parameters the
 * start date and end date to calculate the total price . 
 */
public class Bicycle extends Vehicle{
	public Bicycle(Calendar startDate, Calendar endDate) {
		super("bicycle",startDate,endDate);
		setBaseRate(10);
		setSaturdayRate(1.0);
		setSundayRate(1.0);
		setDayPrices();
		setTotalPrice();
	}

}
