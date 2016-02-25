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
public interface DiscountStrategy {
    public abstract double CalculateDiscountAmt(int qty, double unitCost);
}
