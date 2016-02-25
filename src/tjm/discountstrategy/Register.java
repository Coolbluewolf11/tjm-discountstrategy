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
public class Register {
    private Receipt receipt;
    private String storeName;
    public Register(){
        
    }
    public final void startNewSale(String custId, DatabaseStrategy db){
        
    }
    public final void endSale(){
        
    }
    public final void addItemToSale(String prodID, int qty){
        receipt.addItemToSale(prodID, qty);
    }
    public final void setReciept(Receipt receipt){
        this.receipt = receipt;
    }
    public final String getStoreName(){
        return storeName;
    }
    
}
