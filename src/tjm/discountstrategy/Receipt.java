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
public class Receipt {
    private DatabaseStrategy db;
    private LineItem[] LineItems= new LineItem[0];
    private Customer customer;
            
    public Receipt (DatabaseStrategy db, String custID){
        // requires validation
        setDb(db);
        customer = db.findCustById(custID);
    }
    
    public final DatabaseStrategy getDb(){
        return db;
    }
    
    public final void setDb(DatabaseStrategy db){
        this.db = db;
    }
    
    public final void addItemToSale(String prodId, int qty){
        
    }
    
    public final double getTotalPrice(){
        double totalPrice = 0;
        for(int i = 0; i < LineItems.length; i++){
            totalPrice +=LineItems[i].getDiscountedTotal();
        }
        return totalPrice;
    }
}
