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
    
    public LineItem(String prodId, int qty, DatabaseStrategy db){
        this.qty = qty;
        setProduct(db.findProductById(prodId));
    }
    
    public Product getProduct(){
        return product;
    }
    
    public void setProduct(Product product){
        this.product = product;
    }
    
    public int getQty(){
        return qty;
    }
    
    public void setQty(int qty){
        this.qty = qty;
    }
    public double getSubTotal(){
        double total = product.getUnitCost() * qty;
        return total;
    }
    public double getDiscountedTotal(){
        double total = product.getDiscount().CalculateDiscountAmt(qty, product.getUnitCost());
        return total;
    }
}
