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
public class Lensa implements KameraElemen{
    private String nama;
    
    public Lensa(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    
    public void accept(KameraElemenVisitor visitor) {
        visitor.visit(this);
    }
}
