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
public abstract class Dishes {
    private String name ;
    float PriceBeforeTaxes ;
      private String type ;

    public Dishes(String name, float PriceBeforeTaxes) {
        this.name = name;
        this.PriceBeforeTaxes = PriceBeforeTaxes;
    }

    public float getPriceBeforeTaxes() {
        return PriceBeforeTaxes;
    }

    public void setPriceBeforeTaxes(float PriceBeforeTaxes) {
        this.PriceBeforeTaxes = PriceBeforeTaxes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
  
    
}
