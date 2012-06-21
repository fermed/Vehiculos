/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Pussy
 */
public class Vehiculo {
    
    private String nombre;
    private int ocupantes, llantas;
    private boolean cinturones, hasCinturones;
    
    public Vehiculo(String n){
        this.nombre = n;
        this.cinturones = false;
        this.cinturones = true;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the ocupantes
     */
    public int getOcupantes() {
        return ocupantes;
    }

    /**
     * @param ocupantes the ocupantes to set
     */
    public void setOcupantes(int ocupantes) {
        this.ocupantes = ocupantes;
    }

    /**
     * @return the llantas
     */
    public int getLlantas() {
        return llantas;
    }

    /**
     * @param llantas the llantas to set
     */
    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }
    
    public void abrocharCinturones(){
        if(this.hasCinturones()){
            JOptionPane.showMessageDialog(null, "Cinturones abrochados");
            cinturones = true;
        } else
            JOptionPane.showMessageDialog(null, "Estas loco, no tenemos cinturones");
    }
    
    public boolean getCinturones(){
        return cinturones;
    }
    
    @Override
    public String toString(){
        return this.getNombre() + " puede llevar a " + this.getOcupantes() + " personas gracias a sus " + this.getLlantas() + " Llantas";
    }

    /**
     * @return the hasCinturones
     */
    public boolean hasCinturones() {
        return hasCinturones;
    }

    /**
     * @param hasCinturones the hasCinturones to set
     */
    public void setCinturones(boolean hasCinturones) {
        this.hasCinturones = hasCinturones;
    }
    
}
