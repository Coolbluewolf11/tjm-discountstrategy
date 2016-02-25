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
public class Receipt {
    private DatabaseStrategy db;
    
    public Receipt (DatabaseStrategy db){
        // requires validation
        
    }
    
    public final DatabaseStrategy getDb(){
        return db;
    }
    
    public final void setDb(DatabaseStrategy db){
        this.db = db;
    }
}
