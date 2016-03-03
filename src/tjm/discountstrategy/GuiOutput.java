package tjm.discountstrategy;

import javax.swing.JOptionPane;

/**
 * An implementation of the OutputStrategy contract which sends output to
 * a GUI which simulates the video terminal on a real Cash Register.
 * @author jlombardo@wctc.edu
 */
public class GuiOutput implements OutputStrategy {
    
    /**
     * Outputs the receipt data to selected destination.
     * @param data - the data to output. NOTE: not currently validated!
     */

    @Override
    public void printReceipt(String r) {
        // needs validation
        JOptionPane.showMessageDialog(null, r);
    }
}
