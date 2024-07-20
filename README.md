# TicketReservation_AkshitMadhu_20-July

## This code contains the REST API for Bus Ticket Reservation System .

## ## Tech Stack

* Java
* Spring Framework
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL


  ## Modules

* User Authentication
* Searching for Buses
* Viewing Seat Availability
* Seat Reservation


  ## API'S Created -

# Route API's -   
* `POST - /Reservation/{key}` :  It will create the reservation of ticket.  
* `PUT /Reservation/{key}` : It will update reservation of ticket. 
* `DELETE - `/Reservation/{reservationId}/{key}` : It will delete the reservation.
* `GET - `/Reservation/{reservationId}/{key}` -  It will delete the route detail. 

# Route API's -   
* `GET /route/viewAll` :  It will show all the route details 
* `POST /route/save/{key}` : It create the route of the bus & save in db.
* `GET /route/find/{routeId}` : IT will fetch the route single route detail with provided id   
* `DELETE - /delete/{routeId}/{key} ` -  It will delete the route detail. 

  
# User Controller :-  
* `POST /user/` : User can register in db by providing details .
* `PUT /user/{key}` : It will update the user details in db
* `DELETE /user/{id}/{key}` : It will delete the user from Databse 
* `GET - `/user/{id}/{key}` -  It will fetch user details.
* `GET `/user/{key}` : It fetches the suer details 


 
