/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class GuiOutput implements OutputStrategy {

    @Override
    public void printReceipt(Receipt r) {
      JOptionPane.showMessageDialog(null, r.ReceiptFormat());
    }
    
}