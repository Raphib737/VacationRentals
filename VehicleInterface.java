import java.util.*;
/**
 * @author raphaelbaysa
 *
 */
public interface VehicleInterface{
	
	/*
	 * Returns the Vehicle Name 
	 * 
	 * @param none
	 * @return String vehicleName
	 */
	public String getVehicleName();
	
	/*
	 * Returns the Base rate of the vehicle(Monday-Thursday)
	 * 
	 * @param none
	 * @return double baseRate
	 */
	public double getBaseRate();
	
	/*
	 * Returns the "Premium" saturday rate
	 * 
	 * @param none
	 * @return double saturdayRate
	 */
	public double getSaturdayRate();
	
	/*
	 * Returns the "Discounted' sunday rate
	 * 
	 * @param none
	 * @return double sundayRate
	 */
	public double getSundayRate();
	
	/*
	 * Returns the total price of the Vehicle 
	 * @param none
	 * @return double totalPrice
	 */
	public double getTotalPrice();
	
	/*
	 * Returns the Calendar object start Date
	 * 
	 * @param none
	 * @return Calendar startDate
	 */
	public Calendar getStartDate();
	
	/*
	 * Returns the Calendar Object end Date
	 * 
	 * @param none
	 * @return Calendar endDate
	 */
	public Calendar getEndDate();
}
