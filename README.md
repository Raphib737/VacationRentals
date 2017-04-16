# Paradise Rentals
Hello and welcome to my rental vehicle calculator. Here we 
simulate a rental service that allows a customer to take advantage 
of the numerous vehicles that are available. 

Design
===
For this assignment I decided to have all the cars/cycles/jetskis be subclass of a Vehicle class. I think that 
having a car class would not really have made sense since we were comparing just prices. If there was a concept that
called for differences between motorcycles/bicycles and cars then I would implement it.
The default rates that the vehicle superClass had was the MidSizeCar rates since its pricing greatly influenced
all the other vehicles pricings too. That way in the subclasses constructors, I could change the rate
by calling the super's baserate and adding some addition/subtraction to get the correct total pricing
for each vehicle.

To do the calculation for the cost of each Vehicle, I created a hashmap of all 7 days of the week and the prices
of each week. So for example on Monday-Thursday the midsizeCar hashmap would have the key value pair would be <day,$30> 
 and then for Friday and Saturday it would have <Friday,37.5>,<Saturday,37.5 then <Sunday,24>. Then From there
 we take the startDate and endDate and iterate through the dates in between calling the hashmap to get the 
 day's value.
 
 For special cases, I added a addSubTotalPrice() function to reduce the pricing or increase it like the SUV.
 
 For calculating the "if you have a SUV then you get 1 Free Bike rental" I considered it as a discount/promo concept
  where in the cart I check to see if they exist then if they do I subtract that amount from the cartTotal.

To run:
==

1.) Clone Repo/Get the files

2.) Then:  `javac Main.java`

3.) `java Main`


Vehicle Classes
==

**MidSizeCar**(Calendar startTime, Calendar endTime);

**SportsUtilityVehicle**(Calendar startTime, Calendar endTime);

**EconomyCar**(Calendar startTime, Calendar endTime);
 
**Limousine**(Boolean hasPersonalDriver, Boolean hasFood, Calendar startTime, Calendar endTime);

**Bicycle**(Calendar startTime, Calendar endTime);

**Scooter**(Calendar startTime, Calendar endTime);

**Motorcycle**(int Age, Calendar startTime, Calendar endTime);

**Jetski**(Double hours, Calendar startTime, Calendar endTime);

Calendar Dates
---
For this program I used the [GregorianCalendar data structure](https://docs.oracle.com/javase/7/docs/api/java/util/GregorianCalendar.html)
and to print the dates with [SimpleDataFormat](https://docs.oracle.com/javase/6/docs/api/java/text/SimpleDateFormat.html).




How to use:
---
In Main.java:

1.) Create a Customer(String firstName, String lastName, Int age);
```Java
    Customer c = new Customer("Raphael","Baysa",22);
```

2.) To add to your "cart":
```Java
    MidSizeCar midSizeCar = new MidSizeCar(sunday,monday);
    c.addToCart(midSizeCar);
```

3.) To Checkout your order:
```Java
    c.checkout();
```



Next Version Plans
===
1.) Delete from cart (Have to think about unique identifiers to remove them from the list)

2.) Edit things in the cart (my design was built for this, which is when the client wants to change dates, we have the precalculated
 days price so we dont have to recreate it)
 
3.) Front end UI



