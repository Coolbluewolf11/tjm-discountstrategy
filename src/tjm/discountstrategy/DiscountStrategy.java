package tjm.discountstrategy;

/**
 * The general contract for all discount strategy implementations.
 * @author jlombardo@wctc.edu
 */
public interface DiscountStrategy {
    public abstract double getDiscountAmt(int qty, double unitCost);
}
