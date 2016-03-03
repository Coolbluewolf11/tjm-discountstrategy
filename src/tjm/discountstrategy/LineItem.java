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
public class LineItem {
    private Product product;
    private int qty;
    
    public LineItem(String prodId, int qty, DatabaseStrategy db) {
        setQty(qty);
        setProduct(db.findProductById(prodId));
    }

    /**
     * Gets the extended price (subtotal) for this line item.
     *
     * @return the quantity * unit cost
     */
    public final double getExtPrice() {
        return qty * product.getUnitCost();
    }

    /**
     * Gets the discounted total for this line item
     *
     * @return discounted total for this line item
     */
    public final double getDiscountedTotal() {
        return product.getDiscount().getDiscountAmt(qty, product.getUnitCost());
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        // needs validaiton
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        // needs validaiton
        this.qty = qty;
    }

}
