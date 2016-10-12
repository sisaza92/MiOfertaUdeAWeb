/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.miofertaudea.dao;

import co.edu.udea.miofertaudea.dto.Grupo;
import co.edu.udea.miofertaudea.dto.Impedimento;
import co.edu.udea.miofertaudea.dto.MateriaCursada;
import co.edu.udea.miofertaudea.dto.MateriaOfertada;
import co.edu.udea.miofertaudea.dto.Programa;
import co.edu.udea.miofertaudea.dto.Tanda;
import java.time.Instant;
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
    private  String cedulaEstudiante1 = "101700";
    private  String cedulaEstudiante2 = "101701";
    
    //Ojo validar los datos que ingresan 
    
    /**
     * retorna una lista de programas(contiene el ultimo semestre y el estado)
     * se tendran quemadas solo dos cedulas 101700 y 101701
     * @param cedulaEstudiante
     * @return 
     */
    
    @Override
    public List<Programa> obtenerProgramaYUltimoSemestre(String cedulaEstudiante) {
        
        List<Programa> programas = new ArrayList();
        if (cedulaEstudiante.equals(cedulaEstudiante1)) {
            programas.add(new Programa(504, "Ingeniería de Sistemas", "Activo", "2016-1"));
            programas.add(new Programa(104, "Administración de Empresas", "Cancelado", "2016-1"));
        }else{
            if (cedulaEstudiante.equals(cedulaEstudiante1)) {
                programas.add(new Programa(533, "Ingeniería civil", "Activo", "2016-1"));
            }
            // no existe esa cedula en la base de datos
        }
        
        return programas;
    }
    
    /**
     * retorna las materia ofertadas para el estudiante en el semetre
     * @param cedulaEstudiante
     * @param programa
     * @param semestre
     * @return 
     */
    
    @Override
    public List<MateriaOfertada> obtenerMateriasOfertadas(String cedulaEstudiante, String programa, String semestre) {
       //supongamos que esta es la que retorna la oferta por que la otra retorna es lo que esta cursando
       List<MateriaOfertada> materiasOfertadas = new ArrayList();
        
        if (cedulaEstudiante.equals(cedulaEstudiante1)) {
            materiasOfertadas.add(new MateriaOfertada("2508107","LOGICA Y REPRESENTACION I", 4));
            materiasOfertadas.add(new MateriaOfertada("2508111","MATEMATICAS DISCRETAS I", 4));
            materiasOfertadas.add(new MateriaOfertada("2539100","LECTOESCRITURA", 4));
        }else{
            if (cedulaEstudiante.equals(cedulaEstudiante2)) {
                materiasOfertadas.add(new MateriaOfertada("2536200","FISICA MECANICA", 4));
                materiasOfertadas.add(new MateriaOfertada("2539100","LECTOESCRITURA", 4));
                materiasOfertadas.add(new MateriaOfertada("2517350","FORMAC CIUDADANA Y CONST.", 0));
            }
            // no existe esa cedula en la base de datos
        }
        return materiasOfertadas;
    }

    @Override
    public List<MateriaCursada> obtenerMaterias(String cedulaEstudiante) {
        // supongamos que el estudiante1 actual mente no esta cursando ninguna materia es nuevo en la U
        List<MateriaCursada> materiasCursadas = new ArrayList<>();
        if(cedulaEstudiante.equals(cedulaEstudiante2)){
            materiasCursadas.add(new MateriaCursada());
            materiasCursadas.add(new MateriaCursada());
            materiasCursadas.add(new MateriaCursada());
        }
        return materiasCursadas;
    }

    @Override
    public List<Grupo> obtenerGrupos(String codigoMateria) {
        
        List<Grupo> grupos = new ArrayList();
        // hacer una estructura case of codigoMateria
        switch(codigoMateria){
        case "2508107": //LOGICA Y REPRESENTACION I
                grupos.add(new Grupo("01",30,15,"19-220","wv 12-2","nombreProfesor"));
                grupos.add(new Grupo("02",30,10,"19-310","mj 12-2","nombreProfesor"));
        case "2508111"://MATEMATICAS DISCRETAS I
                grupos.add(new Grupo("01",30,25,"19-220","wv 6-8","sierra"));
                grupos.add(new Grupo("02",30,25,"19-220","wv 6-8","sierra"));
        }
        
        return grupos;
    }

    @Override
    public Tanda obtenerTanda(String cedulaEstudiante) {
        Tanda tanda = null;
        if (cedulaEstudiante.equals(cedulaEstudiante1)) {
            tanda=new Tanda(15,Date.from(Instant.now()));
        }else{
            if (cedulaEstudiante.equals(cedulaEstudiante2)) {
                tanda=new Tanda(22,Date.from(Instant.now()));
            }
            // no existe esa cedula en la base de datos
        }
        return tanda;
    }

    @Override
    public List<Impedimento> obtenerImpedimentos(String cedulaEstudiante) {
        List<Impedimento> impedimentos = new ArrayList();
        if (cedulaEstudiante.equals(cedulaEstudiante1)) {
            impedimentos.add(new Impedimento("2016-1","No pago de matricula"));
            impedimentos.add(new Impedimento("2016-1","No ha devuelto libro"));
        }
        return impedimentos;
    }
}
