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
public interface KameraElemenVisitor {
    public void visit(Kamera kamera);
    public void visit(Lensa lensa);
    public void visit(Tripod tripod);
    public void visit(Flash flash);
}
