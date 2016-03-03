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
public interface DatabaseStrategy {
    public abstract Product findProductById(String prodID);
    public abstract Customer findCustomerById(String custID);
}
