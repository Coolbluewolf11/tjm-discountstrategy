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
public class FlatAmtDiscount implements DiscountStrategy {
    private double discountRate = 5.00;

    public FlatAmtDiscount(double discountRate) {
        setDiscountRate(discountRate);
    }

    public final double getDiscountRate() {
        return discountRate;
    }
   

    public void setDiscountRate(double discountRate) {
        //needs validation
        this.discountRate = discountRate;
    }
    
    
    
    public final double CalculateDiscountAmt(int quantity, double unitCost) {
        //needs validation
        return discountRate;
    }
}
