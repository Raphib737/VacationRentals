package vacationRentals;

/*
 *  Customer Interface displays the possible methods that the Customer Class can use.
 */
public interface CustomerInterface {
	
	/*
	 *  this function returns the first name of the customer
	 *  
	 *  @param none
	 *  @return String firstName
	 */
	public String getFirstName();
	
	/*
	 *  this function returns the last name of the customer
	 *  
	 *  @param none
	 *  @return String lastName
	 */
	public String getLastName();
	
	/*
	 *  this function returns age of the customer
	 *  
	 *  @param none
	 *  @return int age
	 */
	public int getAge();
	
	/*
	 *  this function returns the Cart object
	 *  
	 *  @param none
	 *  @return Cart cart 
	 */
	public Cart getCart();
	
	/*
	 *  this function adds a Vehicle to the cart object
	 *  
	 *  @param Vehicle v
	 *  @return void
	 */
	public void addToCart(Vehicle v);
	
}
