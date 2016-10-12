/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.miofertaudea.dao;

import co.edu.udea.miofertaudea.dto.Tanda;
import java.util.List;

/**
 * 
 * @author Santiago
 */
public interface ServicesDao {
    
    /**
     * retorna los programas del usuario y su ultimo semestre, no está creado,
     * deberá retornar la estructura: programa, nombreprograma, estado, semestre
     * @param cedulaEstudiante
     * @return 
     */
    public List obtenerProgramaYUltimoSemestre(String cedulaEstudiante);
    
    
    /**
     * retorna la lista de materias ofertadas al estudiante
     * @param cedulaEstudiante
     * @param programa
     * @param semestre
     * @return 
     */
    public List obtenerMateriasOfertadas(String cedulaEstudiante, String programa, String semestre);
    
    /**
     * retorna los grupos disponibles de la materia el programa/semestre, no está creado,
     * deberá retornar la estructura: grupo, cupomaximo, cupodisponible, aula, horario, nombreprofesor
     * @param codigoMateria
     * @return 
     */
    public List obtenerGrupos(String codigoMateria);
    
    /**
     * retorna la tanda en el programa/semestre, no está creado, deberá retornar 
     * la estructura: numerotanda, fecha, hora
     * 
     * @param cedulaEstudiante
     * @return 
     */
    public Tanda obtenerTanda(String cedulaEstudiante);
    
    /**
     * retorna los impedimientos el programa, no está creado, deberá retornar la 
     * estructura: semestre, impedimiento
     * @param cedulaEstudiante
     * @return 
     */
    public List obtenerImpedimentos(String cedulaEstudiante);
    
    
}
