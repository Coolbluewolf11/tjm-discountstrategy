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
public class NoDiscount implements DiscountStrategy {
    private double discountRate;
    private final int NO_DISCOUNT = 0;

    public NoDiscount() {
    }

    public final double getDiscountRate() {
        return discountRate;
    }
   

    public final void setDiscountRate(double discountRate) {
        //needs validation
        this.discountRate = discountRate;
    }

    @Override
    public double CalculateDiscountAmt(int qty, double unitCost) {
        //needs validation
        return NO_DISCOUNT;
    }
    
    
}
