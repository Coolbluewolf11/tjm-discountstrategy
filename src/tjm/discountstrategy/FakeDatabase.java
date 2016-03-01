/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tjm.discountstrategy;

/**
 *
 * @author Tim
 */
public class FakeDatabase {
    //private Customer[] customers = new Customer[0];
    private Customer[] customers = {
        //this put 3 customers in our database
        new Customer("100","Bob James"),
        new Customer("200","Sally Smith"),
        new Customer("300","Peter Piper")
        
    };
    private Product[] products ={
        new Product("11","Brewers Hat",29.95,new PercentOffDiscount(.10)),
        new Product("22","Woman's Blouse",49.95,new FlatAmtDiscount(5)),
        new Product("33","Men's Black Belt",39.95,new NoDiscount())
    };
    public final Product findProductById(String ProductId){
         //needs validation
        Product product = null;
        for(Product p : products){
            if (p.getProductId().equals(ProductId)){
                product = p;
                break;
            }
        }
        return product;
    }
    
    public final Customer findCustomerById(String customerId){
        //needs validation
        Customer customer = null;
        for(Customer c : customers){
            if (c.getCustomerId().equals(customerId)){
                customer = c;
                break;
            }
        }
        return customer;
    }
    
}