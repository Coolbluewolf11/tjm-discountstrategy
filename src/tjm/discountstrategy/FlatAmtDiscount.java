package tjm.discountstrategy;

/**
 * An implementation of the DiscountStrategy contract representing a flat
 * dollar amount off the regular price.
 * @author jlombardo@wctc.edu
 */
public class FlatAmtDiscount implements DiscountStrategy {
    private double discountRate;

    public FlatAmtDiscount(double discountRate) {
        setDiscountRate(discountRate);
    }
    
    /**
     * Gets a flat amount off the regular price regardless of quantity.
     * @param qty - the quantity of product purchased. NOTE: not currently
     * validated
     * @param unitCost - the original price of one product. NOTE: not 
     * currently validated.
     * @return 
     */
    @Override
    public final double getDiscountAmt(int qty, double unitCost) {
        //  needs validation
        return discountRate;
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        // needs validation
        this.discountRate = discountRate;
    }
    
}
