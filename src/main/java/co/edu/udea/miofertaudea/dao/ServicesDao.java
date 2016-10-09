/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.miofertaudea.dao;

import co.edu.udea.miofertaudea.service.*;
import java.util.List;

/**
 *
 * @author CristianCamilo
 */
public interface ServicesDao {
    
    /**
     * retorna los programas del usuario y su ultimo semestre, no está creado,
     * deberá retornar la estructura: programa, nombreprograma, estado, semestre
     */
    public List obtenerProgramaYUltimoSemestre();
    
    /**
     * retorna las materias del estudiante en ese semestre (consultamateriasestudiantemares).
     */
    public void obtenerMateriasEnSemestre(String idStudent, String program, String semester);
    
    /**
     * retorna las materias que está cursando en el programa/semestre, no está creado,
     * deberá retornar la estructura: codigomateria, nombremateria, creditos, grupo, horario
     */
    public void obtenerMaterias();
    
    /**
     * retorna los grupos disponibles de la materia el programa/semestre, no está creado,
     * deberá retornar la estructura: grupo, cupomaximo, cupodisponible, aula, horario, nombreprofesor
     */
    public void obtenerGrupos();
    
    /**
     * retorna la tanda en el programa/semestre, no está creado, deberá retornar 
     * la estructura: numerotanda, fecha, hora
     */
    public void obtenerTanda();
    
    /**
     * retorna los impedimientos el programa, no está creado, deberá retornar la 
     * estructura: semestre, impedimiento
     */
    public void obtenerImpedimentos();
    
    
}
