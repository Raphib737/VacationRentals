package vacationRentals;

/*
 * 	Author: Raphael Baysa
 *  The customer class is used to simulate a "customer" who has a Cart object where they can rent out vehicles.
 *  This class is used so we can calculate a users Insurance if they rent a motorcycle since age tells how much
 *  insurance costs. 
 */

public class Customer implements CustomerInterface{
	private String firstName;
	private String lastName;
	private int age;
	private Cart cart;
	
	public Customer(String fn, String ln,int age){
		this.firstName = fn;
		this.lastName = ln;
		this.age = age;
		this.cart = new Cart();
	}

	/*
	 *  Getters and setters 
	 */
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	public void addToCart(Vehicle v){
		this.cart.add(v);
	}
		
	@Override
	public String toString() {
		return "Customer firstName: " + firstName + ", lastName: " + lastName
				+ ", age: " + age + "\n" + cart.toString();
		
	}


	
	
}
