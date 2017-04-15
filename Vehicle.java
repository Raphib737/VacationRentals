import java.text.SimpleDateFormat;
import java.util.*;

/*
 * @author raphaelbaysa
 * The Vehicle superClass is used for inheritance of all the vehicles in the requirements for the 
 * Vacation Rentals project.
 */
public class Vehicle{
	
	//Protected so it can be used and accessed in subclasses
	protected String vehicleName;
	protected double baseRate;
	protected HashMap<String,Double> dayRates;
	protected double saturdayRate;
	protected double sundayRate;
	protected Calendar startDate;
	protected Calendar endDate;
	protected double totalPrice;
	
	public Vehicle(String vehicleName, Calendar startDate, Calendar endDate){
		this.vehicleName = vehicleName;
		this.baseRate = 30.00;
		this.dayRates = new HashMap<String, Double>();
		this.saturdayRate = 1.25;
		this.sundayRate = .8;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalPrice = 0;
	}
	
	/* 
	 * Getters and setters 
	 */
	public String getVehicleName(){
		return vehicleName;
	}
	
	public void setVehicleName(String name){
		vehicleName = name;
	}
	
	public double getBaseRate(){
		return baseRate;
	}
	
	public void setBaseRate(double rate){
		baseRate = rate;
	}

	public void setSaturdayRate(double rate){
		saturdayRate = rate;
	}

	public double getSaturdayRate(){
		return saturdayRate;
	}
	
	public void setSundayRate(double rate){
		sundayRate = rate;
	}
	
	public double getSundayRate(){
		return sundayRate;
	}
	
	protected void setDayPrices(){
		/*
		 *  This generates a hashmap of <"day":"rate"> which is used in
		 *  setTotalPrice() which iterates through the days and sums the prices.
		 */ 
		 String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		 
		 for(String day : days){
			 if(day.equals("Friday") || day.equals("Saturday")){
				 this.dayRates.put(day, saturdayRate*baseRate);
				 
			 }else if(day.equals("Sunday")){
				 this.dayRates.put(day, sundayRate*baseRate);
			 }
			 else{
				 this.dayRates.put(day,baseRate);
			 }
		 }
	}
	
	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar date) {
		startDate = date;
	}

	public Calendar getEndDate() {
		return endDate;
	}

	public void setEndDate(Calendar date) {
		endDate = date;
	}
	

	public void setTotalPrice(){
		/*
		 *  Given the Calendar dates, parse out the day of the week and then iterate through the days
		 *  starting from the startDate and end with endDate to calculate the total price of the Vehicle
		 */
		SimpleDateFormat dayDF = new SimpleDateFormat("EEEEE");
		Calendar iterDate = (Calendar) this.startDate.clone();
		String iterDay = "";
		while(iterDate.compareTo(endDate) <= 0){
			iterDay = dayDF.format(iterDate.getTime());
			this.totalPrice += this.dayRates.get(iterDay);
			iterDate.add(Calendar.DATE,1);
		}
	}
	

	public void addSubTotalPrice(double number){
		/*
		 *  Used to handle special cases for price reductions in certain vehicles
		 */
		this.totalPrice += number;
	}
	
	public double getTotalPrice(){
		return totalPrice;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat dateDF = new SimpleDateFormat("EEEEE yyyy MMM dd");
		return "\tVehicle " + vehicleName + " | totalPrice: $"+ totalPrice + "\n"
				+ "\tstartDate: " + dateDF.format(startDate.getTime()) + " |  endDate: " + dateDF.format(endDate.getTime()) + "\n\n";
	}	
}
