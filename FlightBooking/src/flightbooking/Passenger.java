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
public abstract class Passenger {
    String name;
    int age;
    
        Passenger ( String psnger_name, int AGE)
        {
            String name = psnger_name;
            int age = AGE;       
        }

        public void setName(String psnger_name)
        {
            this.name=psnger_name;
        }
        public String getName()
        {
            return name;
        }

        public void setAge(int AGE)
        {
            this.age=AGE;
        }
        public int getAge()
        {
            return age;
        }
   

    public  abstract  double applyDiscount(double p);
                
}
