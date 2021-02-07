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
public class NonMember extends Passenger {
    
    public   NonMember(String nonmember_name, int nonmember_age){
        
          super(nonmember_name,nonmember_age);
        }
    @Override
    public double applyDiscount(double p)
    {
        if (age>65)
        {
        return p =0.1*p;
        }
        else 
        {
            return p;
            
        }
    }
}
