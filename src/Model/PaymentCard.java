/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Brad
 */
public class PaymentCard extends Person {
    
    Integer paycardNum;
    Double interestRate;
    Integer cardBrand;
    
    public PaymentCard(){
        
    }

    @Override
    public void getInfoArrayList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
