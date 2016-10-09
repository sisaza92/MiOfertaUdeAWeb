/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.miofertaudea.dto;

/**
 *
 * @author CristianCamilo
 */
public class Programa {
    
    private int codigoPrograma;
    private String nombrePrograma;
    private String estado;
    private String ultimoSemestre;

    public Programa(int codigoPrograma, String nombrePrograma, String estado, String ultimoSemestre) {
        this.codigoPrograma = codigoPrograma;
        this.nombrePrograma = nombrePrograma;
        this.estado = estado;
        this.ultimoSemestre = ultimoSemestre;
    }

    
    
    public int getCodigoPrograma() {
        return codigoPrograma;
    }

    public void setCodigoPrograma(int codigoPrograma) {
        this.codigoPrograma = codigoPrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUltimoSemestre() {
        return ultimoSemestre;
    }

    public void setUltimoSemestre(String ultimoSemestre) {
        this.ultimoSemestre = ultimoSemestre;
    }
    
    
}
