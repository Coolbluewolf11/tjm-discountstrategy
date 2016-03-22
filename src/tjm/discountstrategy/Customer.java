package tjm.discountstrategy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
import java.lang.IllegalArgumentException;
public class Customer {
    private String customerId;
    private String customerName;

    public Customer(String customerId, String customerName) {
        //change to setCustomerId. YOou do this because it doesn't have 
        //validation and the setter methods already do.
       setCustomerId(customerId);
       //method says it's overrideable. This means we have to mark them as final
        setCustomerName(customerName);
    }
    

    public String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String CustomerId) throws IllegalArgumentException{
        if(CustomerId == null|| CustomerId.isEmpty()){
            throw new IllegalArgumentException("");
        }
        this.customerId = CustomerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String CustomerName) {
        //needs validation
        this.customerName = CustomerName;
    }
    
    
}