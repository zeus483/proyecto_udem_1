/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1_pe;

/**
 *
 * @author lucifer
 */
public class Proyecto_1_PE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ControlLista clista = new ControlLista(0,0);
        
        
        clista.llenado();
        clista.imprimir2();
        clista.ordenar();
        clista.bucar_normal();
        clista.busquedabinaria();
        
    }
    
}
