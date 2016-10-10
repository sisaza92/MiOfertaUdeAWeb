/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.miofertaudea.dto;

import java.util.Date;

/**
 * Representa la tanda asignada a un estudiante para su respectiva Matricula.
 * @author CristianCamilo
 */
public class Tanda {
    
    private int nroTanda;
    private Date fecha;

    public Tanda(int nroTanda, Date fecha) {
        this.nroTanda = nroTanda;
        this.fecha = fecha;
    }
    
    public int getNroTanda() {
        return nroTanda;
    }

    public void setNroTanda(int nroTanda) {
        this.nroTanda = nroTanda;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
