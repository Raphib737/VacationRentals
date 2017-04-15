package vacationRentals;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * Jet Ski class which is a Vehicle with
 *  BaseRate: 25/Hour
 * The class constructor will take in as its parameters hours reserved,
 * start date and end date to calculate the total price . 
 */
public class Jetski extends Vehicle {
	double hours;
	
	public Jetski(double hours, Calendar startTime, Calendar endTime) {
		super("jetski", startTime, endTime);
		setBaseRate(25);
		setSaturdayRate(1.0);
		setSundayRate(1.0);
		setHours(hours);
		setTotalPrice();
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public void setTotalPrice(){
		totalPrice = getBaseRate() * getHours();
	}

	@Override
	public String toString() {
		SimpleDateFormat dateDF = new SimpleDateFormat("EEEEE yyyy MMM dd");
		return "\tVehicle:" + vehicleName + " | Hours: " + hours + " | totalPrice: $"+ totalPrice + "\n"
				+ "\tstartDate: " + dateDF.format(startDate.getTime()) + " |  endDate: " + dateDF.format(endDate.getTime()) + "\n\n";
	}
	
	
	
}
