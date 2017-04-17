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

    public static SimpleDateFormat sdf = new SimpleDateFormat("EEEEE yyyy MMM dd");

    public static Calendar sunday = new GregorianCalendar(2017, 2, 5); //Sunday
    public static Calendar monday = new GregorianCalendar(2017, 2, 6); //Monday
    public static Calendar tuesday = new GregorianCalendar(2017, 2, 7); //Tuesday
    public static Calendar wednesday = new GregorianCalendar(2017, 2, 8); //Wednesday
    public static Calendar thursday = new GregorianCalendar(2017, 2, 9); //Thursday
    public static Calendar friday = new GregorianCalendar(2017, 2, 10); //Friday
    public static Calendar saturday = new GregorianCalendar(2017, 2, 11); //Saturday
    public static Calendar sunday2 = new GregorianCalendar(2017, 2, 12); //Sunday


	public static void main(String[] args) {
	    System.out.println("\nPrinting out Base weekday values for the vehicles\n");
        showVehicleBaseValues();
        System.out.println("\nPrinting out Friday and Saturday values for the vehicles\n");
        showVehiclePremiumValues();
        System.out.println("\nPrinting out sunday values for the vehicles\n");
        showDiscountedValues();
        System.out.println("\nprinting out multiple day and different day rentals\n");
        showMultipleDaysCalculation();
	}

	public static void showVehicleBaseValues() {
        Customer c = new Customer("Raphael", "Baysa", 18);

        Vehicle ms = new MidSizeCar(tuesday, tuesday);
        c.addToCart(ms);
        Vehicle suv = new SportsUtilityVehicle(false, tuesday, tuesday);
        c.addToCart(suv);

        Vehicle ec = new EconomyCar(tuesday, tuesday);
        c.addToCart(ec);

        Vehicle lux = new LuxuryCar(tuesday, tuesday);
        c.addToCart(lux);

        Vehicle limo = new Limousine(false, false, tuesday, tuesday);
        c.addToCart(limo);

        Vehicle bicycle = new Bicycle(tuesday, tuesday);
        c.addToCart(bicycle);

        Vehicle moto = new Motorcycle(c.getAge(), tuesday, tuesday);
        c.addToCart(moto);

        Vehicle jetski = new Jetski(4, tuesday, tuesday);
        c.addToCart(jetski);

        c.getCart().checkout();
    }



    public static void showVehiclePremiumValues(){
        Customer c = new Customer("Mike", "Ross", 30);

        Vehicle ms = new MidSizeCar(friday, friday);
        c.addToCart(ms);
        Vehicle suv = new SportsUtilityVehicle(false, friday, friday);
        c.addToCart(suv);

        Vehicle ec = new EconomyCar(friday, friday);
        c.addToCart(ec);

        Vehicle lux = new LuxuryCar(friday, friday);
        c.addToCart(lux);

        Vehicle limo = new Limousine(false, false, friday, friday);
        c.addToCart(limo);

        Vehicle bicycle = new Bicycle(friday, friday);
        c.addToCart(bicycle);

        Vehicle moto = new Motorcycle(c.getAge(), friday, friday);
        c.addToCart(moto);

        Vehicle jetski = new Jetski(4, friday, friday);
        c.addToCart(jetski);

        c.getCart().checkout();
    }

    public static void showDiscountedValues() {
        Customer c = new Customer("Harry", "Potter", 21);

        Vehicle ms = new MidSizeCar(sunday, sunday);
        c.addToCart(ms);
        Vehicle suv = new SportsUtilityVehicle(false, sunday, sunday);
        c.addToCart(suv);

        Vehicle ec = new EconomyCar(sunday, sunday);
        c.addToCart(ec);

        Vehicle lux = new LuxuryCar(sunday, sunday);
        c.addToCart(lux);

        Vehicle limo = new Limousine(false, false, sunday, sunday);
        c.addToCart(limo);

        Vehicle bicycle = new Bicycle(sunday, sunday);
        c.addToCart(bicycle);

        Vehicle moto = new Motorcycle(c.getAge(), sunday, sunday);
        c.addToCart(moto);

        Vehicle jetski = new Jetski(4, sunday, sunday);
        c.addToCart(jetski);

        c.getCart().checkout();
    }

    public static void showMultipleDaysCalculation(){
        Customer c = new Customer("Peter","Griffin" ,21);

        Vehicle ms = new MidSizeCar(sunday, monday);
        c.addToCart(ms);

        Vehicle suv = new SportsUtilityVehicle(true, tuesday, thursday);
        c.addToCart(suv);

        Vehicle limo = new Limousine(true, true, friday, friday);
        c.addToCart(limo);

        Vehicle bicycle = new Bicycle(tuesday,thursday);
        c.addToCart(bicycle);

        Vehicle jetski = new Jetski(5, tuesday, tuesday);
        c.addToCart(jetski);

        c.getCart().checkout();
    }
}

