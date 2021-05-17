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
//VARIABLES
public class Flight {
    protected int flightNumber;
    protected String origin;
     protected String destination;
     protected String departureTime;
     protected int capacity;
     protected int numberOfSeatsLeft;
     protected double originalPrice;
    
    
//FLIGHT CONSTRUCTOR 
    Flight(int fN, String o, String d, String dT, int c, int nOSL, double oP){
       flightNumber= fN;
       origin=o;
       destination=d;
       departureTime= dT;
       capacity= c;
       numberOfSeatsLeft=nOSL;
       originalPrice=oP;
       
                if (o.equals(d))
                throw new IllegalArgumentException("The origin and destination are the same");
                
    }
//GETTER SETTER METHODS
        public void setflightNumber (int fN)
        { 
            this.flightNumber=fN;
        }
        public int getflightNumber ()        
        {
            return flightNumber;
        }
        
        public void setOrigin(String o)
        {
            this.origin=o;
        }
        public String getOrigin()
        {
            return origin;
            
        }
        
        public void setDestination(String d)
        {
            this.destination=d;
        }
         
        public String getDestination ()
        {
            return destination;
        }
    
        public void setdepartureTime (String dT)
        {
            this.departureTime=dT;
        }
    
        public String getdepartureTime()
        {
            return departureTime;
        }
    
        public void setCapacity (int c)
        {
            this.capacity=c;
            
        }
        
        public int getCapacity ()
        {
            return capacity;
            
        }
        
        public void setnumberOfSeatsLeft(int nOSL)
        {
            this.numberOfSeatsLeft=nOSL;
        }
        
        public int getnumberOfSeatsLeft()
        {
            return numberOfSeatsLeft;
        }
        
        public void setoriginalPrice (double oP)
        {
            this.originalPrice=oP;
            
        }
         public double getoriginalPrice()
         {
             return originalPrice;
                          
         }
        
         
         public  boolean bookASeat()
         {
             if (numberOfSeatsLeft>0)
             {
                 numberOfSeatsLeft=numberOfSeatsLeft-1;
             return true;
             }
             else {
                     return false;
                  }
         
         
        }
         //OVERIDE STRING METHOD
         @Override
         public String toString()
         {
            return flightNumber  + origin  +  destination + departureTime + originalPrice;           
         }
}      


