package vacationRentals;

import java.util.Calendar;
/**
 *  Limousine class is a Vehicle with
 * 	BaseRate: $100 per day
	driver: +$150 per day
 * The class constructor will take in as its parameters a boolean value representing 
 * if the customer wants a driver and another boolean value if they want food in the limo.
 * iT will also take in the start date and end date. 
 */
public class Limousine extends Vehicle {
	private boolean hasDriver;
	private boolean isPremium;	
	
	public Limousine(boolean hasDriver, boolean isPremium, Calendar startDate, Calendar endDate) {
		super("limousine", startDate,endDate);
		setHasDriver(hasDriver);
		setIsPremium(isPremium);
		
		if(isPremium && hasDriver){
			setBaseRate(325.00);
		}else if(isPremium && !hasDriver){
			setBaseRate(250.00);
		}else if(!isPremium && hasDriver){
			setBaseRate(175.00);
		}else{
			setBaseRate(100);
		}
		
		setSaturdayRate(1.40);
		setDayPrices();
		setTotalPrice();
	}
	
	public void setHasDriver(boolean driver){
		hasDriver = driver;
	}
	
	public boolean hasDriver(){
		return hasDriver;
	}
	
	public boolean isPremium(){
		return isPremium;
	}
	
	public void setIsPremium(boolean premium){
		isPremium = premium;
	}
	
	public void setDayPrices(){
		 String days[] =
			 {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		 
		 for(String day:days){
			 if(day.equals("Saturday") || day.equals("Friday")){
				 dayRates.put(day, ((saturdayRate*100) * (baseRate*100))/10000); //Floating point Issues
				 
			 }else if(day.equals("Sunday")){
				 dayRates.put(day, 100.0);
			 }
			 else{
				 dayRates.put(day,baseRate);
			 }
		 }
	}

}
