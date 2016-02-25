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
public class PercentOffDiscount implements DiscountStrategy{
    private double discountRate;
    
    public PercentOffDiscount(double discountRate) {
        setDiscountRate(discountRate);
    }
    
    public double CalculateDiscountAmt(int qty, double unitCost) {
        return unitCost * qty * discountRate;
    }
    
    public final double getDiscountRate(){
        return discountRate;
    }
    
    public final void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }
}
