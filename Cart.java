import java.text.SimpleDateFormat;
import java.util.ArrayList;

/*
 * Author: Raphael Baysa
 * The Cart class is an attribute of the Customer class. This class is used to store the
 * Vehicle rentals This 
 */
public class Cart implements CartInterface{
	private ArrayList<Vehicle> cart;
	private Double cartTotal;
	private boolean hasSUV;
	private boolean hasBicycle;
	private boolean hasBikeDiscount;
	
	public Cart() {
		this.cartTotal = 0.0;
		this.hasSUV = false;
		this.hasBicycle = false;
		this.cart = new ArrayList<Vehicle>();
	}

	/*
	 *  Setters and Getters 
	 */
	public void setHasSUV(boolean hasSUV){
		this.hasSUV = hasSUV;
	}
	public boolean getHasSUV(){
		return hasSUV;
	}
	
	public void setHasBicycle(boolean hasBicycle){
		this.hasBicycle = hasBicycle;
	}
	
	public boolean hasBicycle(){
		return hasBicycle;
	}
	
	public boolean hasBikeDiscount(){
		return hasBikeDiscount;
	}
	
	public void setHasBikeDiscount(boolean hasDiscount){
		hasBikeDiscount = hasDiscount;
	}
	
	public ArrayList<Vehicle> getCart() {
		return this.cart;
	}

	public void setCart(ArrayList<Vehicle> cart) {
		this.cart = cart;
	}

	public Double getCartTotal() {
		return cartTotal;
	}

	public void setCartTotal(Double cartTotal) {
		this.cartTotal = cartTotal;
	}
	
	public void add(Vehicle v){
		/* Adds vehicles to the cart but also checks to see the special case where
		*  If we rent a SUV then a bike rental is free
		*/
		cart.add(v);
		if(!hasBikeDiscount){
			
			if(v.getVehicleName().equals("suv")){
				setHasSUV(true);
			}
		
			if(v.getVehicleName().equals("bicycle")){
				setHasBicycle(true);
			}
				
			if(this.hasBicycle() && this.getHasSUV()){
				subCartTotal(v.getTotalPrice());
				this.setHasBikeDiscount(true);
			}
		}
		cartTotal += v.getTotalPrice();
	}
	
	
	private void subCartTotal(double amount){
		/*
		 *  This private method allows for a change in the cart price used specifically for the special case
		 *  for deals such as a bicycle rental is free if there is an SUV in the cart.
		 */	
		cartTotal -= amount;
	}
	
	public void checkout(){
		/*  This function is used to simulate that the user is 'checking out' and done
		 *  adding vehicles to their cart. This will display the total price as well
		 *  as the individual prices of each Vehicle and all discounts applied
		 */
		SimpleDateFormat dateDF = new SimpleDateFormat("EEEEE yyyy MMM dd");
		System.out.println("------------------Checking Out--------------------------");
		System.out.println("Order summary: ");
		System.out.print("Cart Total: $" + cartTotal);
		
		if(hasBikeDiscount){
			System.out.println(" (free 1 bike rental with SUV reflected on cart total)");
		}
		else{
			System.out.println("");
		}
		
		for(Vehicle v: cart){
			System.out.println("\t"+ v.getVehicleName() + "\n\t  price: $"+v.getTotalPrice() + "\t" 
					+ "| startDate: " + dateDF.format(v.getStartDate().getTime()) + " |  endDate: " + dateDF.format(v.getEndDate().getTime()));
		}
		System.out.println("---------------------------------------------------------");
	}

	@Override
	public String toString() {
		String s = "cartTotal: $" + cartTotal +"\n";
		for(Vehicle v: cart){
			s+= "  " + v.getVehicleName() + " total price: $" + v.getTotalPrice() + "\n";
		}
		return s;
	}
	
	
	
}
