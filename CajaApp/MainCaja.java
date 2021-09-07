/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajaApp;

/**
 *
 * @author Usuario
 */
public class MainCaja {
    
    public static void main(String[] args){
    Caja caja1=new Caja();
    
    caja1.alto=2;
    caja1.ancho=3;
    caja1.profundo=6;
    int volumen=caja1.ancho*caja1.alto*caja1.profundo;
        System.out.println("el volumen es: "+volumen);
    }
}
