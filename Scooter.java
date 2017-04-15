package vacationRentals;
import java.util.*;

/*
 * Scooter class which is a Vehicle with
 * BaseRate: 25/day
 * The class constructor will take in as its parameters the
 * start date and end date to calculate the total price . 
 */
public class Scooter extends Vehicle {

	public Scooter(Calendar startDate, Calendar endDate) {
		super("scooter",startDate,endDate);
		setBaseRate(25);
	}

}
