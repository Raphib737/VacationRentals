import java.util.Calendar;

/*
 * MotorCycle class which is a Vehicle with
 * BaseRate: 30/day (Same rate as midsize car)
 * Insurance Fees:
 *  18-25 yrs = $50
 *  26-32 yrs = $35
 *  33-45 yrs = $15
 *   > 45 yrs = free
 * The class constructor will take in as its parameters the age of the customer,
 * start date and end date to calculate the total price . 
 */
public class Motorcycle extends Vehicle{
	private int riderAge;
	private double insuranceFee = 0.0;

	public Motorcycle(int age, Calendar startDate, Calendar endDate) {
			super("motorcycle",startDate,endDate);
			setRiderAge(age);
			
			if(age >= 45){ setInsuranceFee(0);}
			else if(age >= 33){ setInsuranceFee(15);}
			else if(age >= 26){ setInsuranceFee(35);}
			else if(age >= 18){ setInsuranceFee(50);}
			else{
				System.out.println("Customer can not rent a motorcycle. Reason: Too Young.");
				setInsuranceFee(99999);
			}
			
			setDayPrices();
			addSubTotalPrice(getInsuranceFee());
			setTotalPrice();
	}
	
	public void setRiderAge(int age){
		riderAge = age;
	}
	
	public int getRiderAge(){
		return riderAge;
	}
	
	public void setInsuranceFee(double fee){
		insuranceFee = fee;
	}
	
	public double getInsuranceFee(){
		return insuranceFee;
	}

}
