/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.miofertaudea.dto;

/**
 * Representa una materia que será ofertada a un estudiante.
 * @author CristianCamilo
 */
public class MateriaOfertada {
    
    private String codigomateria;
    private String nombreMateria;
    private int creditos;
    private String grupo;
    private String horario; // El horario deberia estár aqui? solo deberia pertenecer a grupo.

    public String getCodigomateria() {
        return codigomateria;
    }

    public void setCodigomateria(String codigomateria) {
        this.codigomateria = codigomateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
}
