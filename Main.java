/**
 * @author raphael baysa
 * This is the main function for the Vacation Rentals project. 
 * Test dates range for a week period but this program can handle any time span given that the
 * startTime is before the endTime,
 * 
 * Dates are formatted using the GregorianCalendar object and dates taken to consideration are the 
 * Day Month and Year.
 * 
 * To test/run this program, Create a Customer class then initialize a certain Vehicle class and add
 *  to cart (customer.addToCart()) When you want to check out the total price and what is in your cart 
 *  call the checkout function on the cart.
 */

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("EEEEE yyyy MMM dd");

		Calendar sunday = new GregorianCalendar(2017,2,5); //Sunday		
		Calendar monday = new GregorianCalendar(2017,2,6); //Monday
		Calendar tuesday = new GregorianCalendar(2017,2,7); //Tuesday
		Calendar wednesday = new GregorianCalendar(2017,2,8); //Wednesday
		Calendar thursday = new GregorianCalendar(2017,2,9); //Thursday
		Calendar friday = new GregorianCalendar(2017,2,10); //Friday
		Calendar saturday = new GregorianCalendar(2017,2,11); //Saturday
		Calendar sunday2 = new GregorianCalendar(2017,2,12); //Sunday
		
		Customer c = new Customer("Raphael","Baysa",18);
		
		Vehicle ms = new MidSizeCar(saturday,saturday);
		c.addToCart(ms);

		Vehicle suv = new SportsUtilityVehicle(false,saturday,saturday);
		c.addToCart(suv);		

		Vehicle ec = new EconomyCar(saturday,saturday);
		c.addToCart(ec);
		
		Vehicle lux = new LuxuryCar(friday,friday);
		c.addToCart(lux);
		
		Vehicle limo = new Limousine(true,false,sunday,sunday);
		c.addToCart(limo);

		Vehicle bicycle = new Bicycle(sunday,sunday2);
		c.addToCart(bicycle);
		
//		Vehicle moto = new Motorcycle("moto",c.getAge(),sunday,sunday);
//		c.addToCart(moto);
		
//		Vehicle jetski = new Jetski("jetski",4,friday,friday);
//		c.addToCart(jetski);
		
		c.getCart().checkout();
	}

}

