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
public class KameraElemenPrintVisitor implements KameraElemenVisitor{

    @Override
    public void visit(Kamera kamera) {
        System.out.println("Kamera DSLR");
    }

    @Override
    public void visit(Lensa lensa) {
        System.out.println(lensa.getNama());
    }

    @Override
    public void visit(Tripod tripod) {
        System.out.println("Tripod");
    }

    @Override
    public void visit(Flash flash) {
        System.out.println("Flash");
    }
}
