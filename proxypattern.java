/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanagementsystem;

/**
 *
 * @author jeeva
 */
public class proxypattern {
    
    
   
    public double getRemainder(double total)
    {
        double rem=50000-total; //let's say 18000 is the total fee
       
        if(rem ==0){
      
        rem = 0;
        }
        return rem;
            
    }
    
    public String getStatus(double rem){
        String status;
        if(rem ==0){
        status="paid";
        
        }
        else if(rem<0){
           status="extra fee paid! will be forwarded"; 
        }
        else{
        status="unpaid";}
        
        return status;
    }
}
