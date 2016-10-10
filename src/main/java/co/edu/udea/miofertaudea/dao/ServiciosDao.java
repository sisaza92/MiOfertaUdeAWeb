/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.miofertaudea.dao;

import co.edu.udea.miofertaudea.dto.Impedimento;
import co.edu.udea.miofertaudea.dto.MateriaOfertada;
import co.edu.udea.miofertaudea.dto.Programa;
import co.edu.udea.miofertaudea.dto.Tanda;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * implementacion de los servicios para realizar las pruebas de la aplicacion
 * de momento se quemaran los datos y solo se tendra informacion de 2 estudiantes
 * @author Santiago
 */
public class ServiciosDao implements ServicesDao {
    // cedulas quemadas para suponer que estan el la base de datos
    private  long cedulaEstudiante1=101700;
    private  long cedulaEstudiante2=101701;
    
    /**
     * retorna una lista de programas(contiene el ultimo semestre y el estado)
     * se tendran quemadas solo dos cedulas 101700 y 101701
     * @param cedulaEstudiante
     * @return 
     */
    
    @Override
    public List<Programa> obtenerProgramaYUltimoSemestre(long cedulaEstudiante) {
        
        List<Programa> programas = new ArrayList();
        if (cedulaEstudiante == cedulaEstudiante1) {
            programas.add(new Programa(504, "Ingeniería de Sistemas", "Activo", "2016-1"));
            programas.add(new Programa(104, "Administración de Empresas", "Cancelado", "2016-1"));
        }else{
            if (cedulaEstudiante == cedulaEstudiante2) {
                programas.add(new Programa(533, "Ingeniería civil", "Activo", "2016-1"));
            }
            // no existe esa cedula en la base de datos
        }
        
        return programas;
    }
    
    /**
     * retorna las materia ofertadas para el estudiante en el semetre
     * @param idStudent
     * @param programa
     * @param semestre
     * @return 
     */
    
    @Override
    public List<MateriaOfertada> obtenerMateriasEnSemestre(long idStudent, String programa, String semestre) {
       //supongamos que esta es la que retorna la oferta por que la otra retorna es lo que esta cursando
        List<MateriaOfertada> materiasOfertadas = new ArrayList();
        materiasOfertadas.add(new MateriaOfertada());
        
        return materiasOfertadas;
    }

    @Override
    public void obtenerMaterias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obtenerGrupos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tanda obtenerTanda(long cedulaEstudiante) {
        Tanda tanda = null;
        if (cedulaEstudiante == cedulaEstudiante1) {
            tanda=new Tanda(15,Date.from(Instant.now()));
        }else{
            if (cedulaEstudiante == cedulaEstudiante2) {
                tanda=new Tanda(22,Date.from(Instant.now()));
            }
            // no existe esa cedula en la base de datos
        }
        return tanda;
    }

    @Override
    public List<Impedimento> obtenerImpedimentos(long cedulaEstudiante) {
        List<Impedimento> impedimentos = new ArrayList();
        if (cedulaEstudiante == cedulaEstudiante1) {
            impedimentos.add(new Impedimento("2016-1","No pago de matricula"));
            impedimentos.add(new Impedimento("2016-1","No ha devuelto libro"));
        }
        return impedimentos;
    }
    
    
    
}
