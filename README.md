## Day 11 Assignment

Create an application using the Microservices approach based on the given information:

a. FlightInformationSystem maintains the information of various flights either in a database or in a collection object. Each flight has the following information - Flight id, From city, To City, start time, end time, distance in KMs. The system should provide requested the distance information to other services that invoke it.

b. PricingSystem maintains the price per kilometer information for flights. The price calculation is done using a combination of factors such as – distance slab (longer distance flights can have lower per km cost compared to shorter distance), weekends and holidays, and travel duration. The system should provide pricing information to other services when invoked

c. FlightBooking system is the customer facing application that is used by users to book flights. It interacts with the FlightInformationSystem and PricingSystem services to enable users to book flights. It records the booking details and displays the ticket information to the user.

Ensure all the Microservices that you create follow the layered approach and handle exceptions appropriately.
