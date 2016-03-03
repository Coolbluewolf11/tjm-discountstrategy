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
public class TJMDiscountStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /////////////////////////////////////////////////////////////////
        // KLUDGE: do configuration here for strategy options:
        /////////////////////////////////////////////////////////////////
        
        DatabaseStrategy db = new FakeDatabase();
        ReceiptFormatStrategy fmt = new VerboseReceiptFormat();
        OutputStrategy[] outputs = {
            new ConsoleOutput(),
            new GuiOutput()
        };       
        Register register = new Register("Kohls Department Store");
        register.startNewSale("100", db, fmt, outputs);
        
        register.addItemToSale("11", 2);
        register.addItemToSale("22", 1);
        register.addItemToSale("33", 3);        
        register.endSale();   
    }
    
}
