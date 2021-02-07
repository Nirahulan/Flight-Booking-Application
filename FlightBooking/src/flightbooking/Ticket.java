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
public class Ticket {
    Passenger passenger;
    Flight flight;
    double price;
    int number=100;
    
    Ticket (Passenger psnger, Flight f,double pri)
    {
    Passenger passenger = psnger;
    Flight flight= f;
    double price= pri;
    //int number=tN;
  
    }
    //GETTERS AND SETTERS
        public void setPassenger( Passenger psnger)
        {
            this.passenger= psnger;
        }
         public Passenger getPassenger ()
         {
             return passenger;
         }

         public void setFlight(Flight f)
         {
             this.flight=f;
         }
        public Flight getFlight ()
        {
            return flight;

        }

        public void setPrice(double pri)
        {
            this.price=pri;
        }
        public double getPrice()
        {
            return price;
        }

        public void setNumber(int tN)
        {
          this.number=tN;
        }
        public int getNumber()
        {
            return number;
        }
    
    @Override
    public String toString()
    {
        return passenger.getName()+flight.getflightNumber()+flight.getOrigin()+flight.getDestination()+flight.getoriginalPrice()+price;
    }
    
    
    
    
    
}
