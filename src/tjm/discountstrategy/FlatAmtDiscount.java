package tjm.discountstrategy;

/**
 * An implementation of the DiscountStrategy contract representing a flat
 * dollar amount off the regular price.
 * @author Tim
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
        if(qty == 0){
            throw new IllegalArgumentException("The quantity must be greater than 0");
        }
        return discountRate*qty;
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        // needs validation
        this.discountRate = discountRate;
    }
    
}
