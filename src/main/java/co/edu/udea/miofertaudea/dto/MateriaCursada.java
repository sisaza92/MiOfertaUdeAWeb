/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.miofertaudea.dto;

/**
 * Representa una materia cursada por un estudiante en un semestre especifico
 * es el resultado de el consumo del servicio ConsultaMateriaEstudiante de mares.
 * @author CristianCamilo
 */
public class MateriaCursada {
    
    private Long semestre;
    private Long materia;
    private String codigo;
    private String nombre;
    private Long grupo;
    private int creditos;
    private String tipoHomologacion;
    private double nota;

    public Long getSemestre() {
        return semestre;
    }

    public void setSemestre(Long semestre) {
        this.semestre = semestre;
    }

    public Long getMateria() {
        return materia;
    }

    public void setMateria(Long materia) {
        this.materia = materia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getGrupo() {
        return grupo;
    }

    public void setGrupo(Long grupo) {
        this.grupo = grupo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getTipoHomologacion() {
        return tipoHomologacion;
    }

    public void setTipoHomologacion(String tipoHomologacion) {
        this.tipoHomologacion = tipoHomologacion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
}
