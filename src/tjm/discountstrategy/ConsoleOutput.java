package tjm.discountstrategy;


import tjm.discountstrategy.OutputStrategy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class ConsoleOutput implements OutputStrategy {

    @Override
    public void printReceipt(String r) {
        System.out.println(r);
    }
    
}