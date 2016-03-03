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
    private static int receiptNo;
    private String storeName;
    private DatabaseStrategy db;
    private Customer customer;
    private LineItem[] LineItems;
            
    public Receipt(String storeName, String custId, DatabaseStrategy db) {
        setStoreName(storeName);
        receiptNo++;
        setDb(db);
        setCustomer(db.findCustomerById(custId));
        LineItems = new LineItem[0];
    }
    
    public final DatabaseStrategy getDb(){
        return db;
    }
    
    public final void setDb(DatabaseStrategy db){
        this.db = db;
    }
    
    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        // needs validation
        this.customer = customer;
    }
    
    public final LineItem[] getLineItems() {
        return LineItems;
    }

    public final void setLineItems(LineItem[] lineItems) {
        // needs validaiton
        this.LineItems = lineItems;
    }

    public static int getReceiptNo() {
        return receiptNo;
    }

    public final String getStoreName() {
        return storeName;
    }

    public final void setStoreName(String storeName) {
        // needs validation
        this.storeName = storeName;
    }
    
    public final void addItemToReceipt(String prodId, int qty) {
        // needs validation for all arguments passed in
        LineItem item = new LineItem(prodId, qty, db);
        addItemToArray(LineItems, item);
    }
    
    private final void addItemToArray(LineItem[] origArray, LineItem item) {
        LineItem[] tempArray = new LineItem[origArray.length + 1];
        System.arraycopy(origArray, 0, tempArray, 0, origArray.length);
        tempArray[tempArray.length - 1] = item;
        origArray = tempArray;
        LineItems = origArray;
    }
    
    public final void removeItemFromArray(String prodId, int qty) {
        // needs validation for all arguments passed in
        for(int i=0; i < LineItems.length; i++) {
            if(LineItems[i].getProduct().getProdId().equals(prodId)) {
                // delete from memory if found
                LineItems[i] = null;
                break;
            }
        }
        shrinkArray(LineItems);
    }
    
    private void shrinkArray(LineItem[] origArray) {
        // Make a new array one size smaller than original
        LineItem[] tempArray = new LineItem[LineItems.length-1];
        
        // copy items into new temporary array if not null
        for(int i=0, j=0; i < origArray.length; i++) {
            if(origArray[i] != null) {
                tempArray[j++] = origArray[i];
            }
        }
        
        // replace original with temp, which is now one smaller
        LineItems = tempArray;
    }
    
    public final double getTotalPrice(){
        double totalPrice = 0;
        for(int i = 0; i < LineItems.length; i++){
            totalPrice +=LineItems[i].getDiscountedTotal();
        }
        return totalPrice;
    }
    
    public String ReceiptFormat(){
        String a = "";
        a += LineItems[0].getProduct().getProdName();
        a += "   " + LineItems[0].getProduct().getUnitCost();
        a += "   " + LineItems[0].getQty();
        a += "   " + LineItems[0].getDiscountedTotal();
        for(int i = 1; i<LineItems.length;i++){
            a += "/ln" + LineItems[i].getProduct().getProdName();
            a += "   " + LineItems[i].getProduct().getUnitCost();
            a += "   " + LineItems[i].getQty();
            a += "   " + LineItems[i].getDiscountedTotal();
        }
        
        return a;
    }
}
