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


public class FlightTestmain {
// public static void main (String args [])
    {
       Flight aircanada = new Flight (101,"Toronto","Toronto","Today",1000,0,0);
       System.out.println(aircanada.getflightNumber());
       System.out.println(aircanada.getOrigin());
       System.out.println(aircanada.getDestination());
       System.out.println(aircanada.getdepartureTime());
       System.out.println(aircanada.getoriginalPrice());
       
    }
}
    

