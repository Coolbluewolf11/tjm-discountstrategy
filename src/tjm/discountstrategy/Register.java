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
    private ReceiptFormatStrategy fmt;
    private OutputStrategy[] outputs;

    /**
     * Custom constructor initializes register with store name. 
     * @param storeName 
     */
    public Register(String storeName) {
        this.storeName = storeName;
    }
    
    /**
     * Start and configure a new sale. NOTE: currently no validation of
     * method arguments.
     * @param custId - the unique id of a customer
     * @param db - the persistence provider
     * @param fmt - the format of the final receipt
     * @param output - the destination of the receipt
     */
    public final void startNewSale(String custId, DatabaseStrategy db,ReceiptFormatStrategy fmt, OutputStrategy[] outputs) {
        // needs validation
        receipt = new Receipt(storeName, custId, db);
        setFmt(fmt);
        setOutputs(outputs);
    }
    
    /**
     * End the sale for a customer and causes a receipt to be output, 
     * possibly to multiple destinations.
     */
    public final void endSale() {
        String data = fmt.format(receipt);
        for(OutputStrategy out : outputs) {
            out.printReceipt(data);
        }
    }
    
    /**
     * Adds an item to a sale order. NOTE: currently no validation of
     * method arguments.
     * @param prodId - the unique id of a product which simulates what a
     * bar code scanner would capture
     * @param qty - the number of this product being purchased
     */
    public final void addItemToSale(String prodId, int qty) {
        // needs validation
        receipt.addItemToReceipt(prodId, qty);
    }
    
    /**
     * Removes an item from a sale order. NOTE: currently no validation of
     * method arguments.
     * @param prodId - the unique id of a product which simulates what a
     * bar code scanner would capture
     * @param qty - the number of this product being purchased
     */
    public final void removeItemFromArray(String prodId, int qty) {
        // needs validation
        receipt.removeItemFromArray(prodId, qty);
    }
    
    ///// GETTERS/SETTERS DON'T NEED DOCS UNTIL VALIDATION CODE ADDED /////

    public final Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        // needs validation
        this.receipt = receipt;
    }

    public final String getStoreName() {
        return storeName;
    }

    public final void setStoreName(String storeName) {
        // needs validation
        this.storeName = storeName;
    }

    public final ReceiptFormatStrategy getFmt() {
        return fmt;
    }

    public final void setFmt(ReceiptFormatStrategy fmt) {
        // needs validation
        this.fmt = fmt;
    }

    public final OutputStrategy[] getOutputs() {
        return outputs;
    }

    public final void setOutputs(OutputStrategy[] outputs) {
        // needs validation
        this.outputs = outputs;
    }
    
    
}
