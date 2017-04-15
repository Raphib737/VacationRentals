/*
 *  Cart Interface displays the possible methods that the Cart Class can use.
 */
public interface CartInterface {
	/* 
	 *  Returns the total cart price taking into account all 'discounts'
	 *  
	 *  @param None
	 */
	public Double getCartTotal();
	
	/* 
	 * Adds vehicles to the cart but also checks to see the special case where
	 *  If we rent a SUV then a bike rental is free
	 *  
	 *  @param Vehicle v takes a vehicle object and adds it to the customers cart
	 *  @return void
	 */
	public void add(Vehicle v);
	
	/*  
	 * This function is used to simulate that the user is 'checking out' and done
	 *  adding vehicles to their cart. This will display the total price as well
	 *  as the individual prices of each Vehicle and all discounts applied
	 * 
	 *  @param None
	 *  @return void
	 */
	public void checkout();
}
