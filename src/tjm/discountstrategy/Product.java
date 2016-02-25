package tjm.discountstrategy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class Product {
    private String productId;
    private String productName;
    private double unitCost;
    private DiscountStrategy discount;

    public Product(String productId, String productName, double unitCost, DiscountStrategy discount) {
      setProductId(productId);
      setProductName(productName);
      setUnitCost(unitCost);
      setDiscount(discount);
    }

    public final String getProductId() {
        return productId;
    }

    public final void setProductId(String productId) {
        //needs validation
        this.productId = productId;
    }

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        //needs validation
        this.productName = productName;
    }

    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) {
        //needs validation
        this.unitCost = unitCost;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }

    public final void setDiscount(DiscountStrategy discount) {
        //needs validation
        this.discount = discount;
    }
}
