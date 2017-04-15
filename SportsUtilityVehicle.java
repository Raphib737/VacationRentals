package vacationRentals;

import java.util.*;

/**
 *  SportsUtilityVehicle class is a Vehicle with
 * 	BaseRate: 50% more than the MidSize Vehicle
 *  *1 bike is free if rent an SUV
 * The class constructor will take in as its parameters a boolean saying if 
 * the customer is going to take the vehicle off road or not,
 * start date and end date to calculate the total price. 
 */
public class SportsUtilityVehicle extends Vehicle{
	boolean isGoingOffRoad; 
	
	public SportsUtilityVehicle(boolean isGoingOffRoad, Calendar startDate, Calendar endDate) {
		super("suv",startDate, endDate);
		
		setgoingOffRoad(isGoingOffRoad);
		setBaseRate(super.getBaseRate()*1.50);
		setDayPrices();
		setTotalPrice();
		
		if(isGoingOffRoad){
			addSubTotalPrice(15);
		}
	}	
	
	/*
	 *  Getters and Setters
	 */
	public void setgoingOffRoad(boolean going){	
		isGoingOffRoad = going;
	}
	
	public boolean isGoingOffRoad(){
		return isGoingOffRoad;
	}

}
