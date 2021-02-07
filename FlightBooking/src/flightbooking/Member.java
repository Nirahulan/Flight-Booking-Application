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
 public class Member extends Passenger{
        int yearsOfMembership;
     
    public Member(String name, int age, int yearsOfMembership){
        super(name,age);
        this.yearsOfMembership = yearsOfMembership;
    }

    public int getYearsOfMembership() {
        return yearsOfMembership;
    }

    public void setYearsOfMembership(int yearsOfMembership) {
        this.yearsOfMembership = yearsOfMembership;
    }

    @Override
    public double applyDiscount(double p)
    {
        if (yearsOfMembership> 5)
        {
            return p = 0.5*p;
        }
        if (yearsOfMembership <= 5 && yearsOfMembership > 1 )    
        {
           return p = 0.9*p;
        }
        else
        {
               return p;
        }
        
    }
     
     
    }
