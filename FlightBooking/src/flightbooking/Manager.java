/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightbooking;

/**
 *
 * @author Nirahulan.P
 */


public class Manager {
    
 
   
  Flight [] flights = new Flight[3];
  Ticket [] tickets = new Ticket[5];
   
  //ArrayList<Flight> airlines = new ArrayList<Flight>();
  //Flight air_canada = new Flight(101,"Toronto","London","Today",1000,0,0);
 // Flight american_airlines = new Flight(101,"Toronto","Cleveland","Today",2000,0,0);
   
   //Flight aircanada = new Flight (101,"Toronto","London","Today",1000,0,0);
   public void createFlights()
   {
 
   Flight flight1 = new Flight(101   ,"   Toronto  "  ,"London  ","Monday August 21st 2019  ",0,0,1000);
   flights[0]=flight1;
   Flight flight2 = new Flight(202,"Toronto  ","Cleveland  ","Tuesday August 22nd 2019  ",0,0,1000);
   flights[1]=flight2; 
   Flight flight3 = new Flight(303,"Montreal  ","Vancouver   ","Wednesday August 23rd 2019  ",0,0,1000);
   flights[2]=flight3;
   
    
   
   }
   
   public void displayAvailableFlights(String origin, String destination)
   {
   System.out.println(flights[0].toString());
   //System.out.println(flights[1].toString());
   //System.out.println("American Airlines" + american_airlines.flightNumber+american_airlines.origin+"to" +american_airlines.destination);
   
   
   }
    
   public Flight getFlight(int flightNumber) 
   {
       for (Flight flight:flights)
       
           if (flight.getflightNumber()==flightNumber)
           { return flight;
            }
        return null;
        
       
       
   }
   
   
  public void bookSeat(int flightNumber, Passenger p)
  {
     // System.out.println("Booking seat for Air Cananada");
     //System.out.println("Passenger is Member");
     //System.out.println("Flight is available");
      Flight flight = getFlight(flightNumber);
      
      
      if (flight!=null)
    {
       if(flight.bookASeat())
       {
           
          //Ticket ticket= new Ticket(p,flight,p.applyDiscount(flight.getoriginalPrice()));
           Ticket ticket = new Ticket(p,flight,p.applyDiscount(flight.getoriginalPrice()));
           System.out.println("issued ticket"+ ticket.toString());
           tickets[ticket.getNumber()]=ticket;
           
           
           
       }
        
      
    }
      
  }
    
  public static void main(String args [])
  {
      Passenger p1 = new Member("amirthy", 24,1);
      Passenger p2 = new Member("kugan", 50,20);
      
      Passenger p3 = new Member("somar", 75,70);
      
        Manager manager = new Manager();
        
        manager.createFlights();
        System.out.println("Electronic Ticket:");
        manager.displayAvailableFlights("Toronto", "London");
      
        manager.bookSeat(101, p3);
        
        
        
      
      
  }
   
    
    
    
    
}
