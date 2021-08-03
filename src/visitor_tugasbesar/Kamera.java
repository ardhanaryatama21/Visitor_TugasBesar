/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor_tugasbesar;

/**
 *
 * @author FR13NDS
 */
public class Kamera implements KameraElemen{
    KameraElemen[] elemen;

    public Kamera() {
        //create new Array of elements
        this.elemen = new KameraElemen[] { new Lensa("Lensa Kit"), 
            new Lensa("Lensa Telephoto"), new Lensa("Lensa Macro") , 
            new Lensa("Lensa Prime"), new Tripod(), new Flash() };
    }

    public void accept(KameraElemenVisitor visitor) {     
        for(KameraElemen elem : elemen) {
            elem.accept(visitor);
        }
        visitor.visit(this);    
    }
}
