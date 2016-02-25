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
public class QuantityDiscount implements DiscountStrategy {

    private double discountRate;
    private  int minimumQuantity;
    private final int NO_DISCOUNT = 0;

    public QuantityDiscount(double discountRate, int minimumQuantity) {
        setDiscountRate(discountRate);
        setMinimumQuantity(minimumQuantity);
    }

    public int getMinimumQuantity() {
        return minimumQuantity;
    }

    public final void setMinimumQuantity(int minimumQuantity) {
        //needs validation
        this.minimumQuantity = minimumQuantity;
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        //needs validation
        this.discountRate = discountRate;
    }

    @Override
    public final double CalculateDiscountAmt(int quantity, double unitCost) {
        //needs validation
        if (quantity >= minimumQuantity) {
            return unitCost * quantity * discountRate;
        } else {
            return NO_DISCOUNT;
        }

    }

}
