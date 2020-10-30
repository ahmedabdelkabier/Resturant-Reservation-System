/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantreservationsystem;

/**
 *
 * @author hp
 */
public class Desert extends Dishes{
    private double PriceAfterTaxes;

    public double getPriceAfterTaxes() {
        PriceAfterTaxes=PriceBeforeTaxes*1.15;
        return PriceAfterTaxes;
    }

    public Desert( String name, float PriceBeforeTaxes) {
        super(name, PriceBeforeTaxes);
        //this.PriceAfterTaxes = PriceAfterTaxes;
    }   
    
    
}
