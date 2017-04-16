# VacationRentals
Hello and welcome to my rental vacations calculator. Here we 
simulate a rental service that allows a customer to take advantage 
of the numerous vehicles that are available. 

To run:
==

1.) Clone Repo/Get the files

2.) Then:  `javac Main.java`

3.) `java Main`


Vehicle Classes
==

MidSizeCar(Calendar startTime, Calendar endTime);

SportsUtilityVehicle(Calendar startTime, Calendar endTime);

EconomyCar(Calendar startTime, Calendar endTime);
 
Limousine(Boolean hasPersonalDriver, Boolean hasFood, Calendar startTime, Calendar endTime);

Bicycle(Calendar startTime, Calendar endTime);

Scooter(Calendar startTime, Calendar endTime);

Motorcycle(int Age, Calendar startTime, Calendar endTime);

Jetski(Double hours, Calendar startTime, Calendar endTime);

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
