/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.miofertaudea.dao;

import co.edu.udea.miofertaudea.dto.Grupo;
import co.edu.udea.miofertaudea.dto.Impedimento;
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
    
   
    @Override
    public List<Programa> obtenerProgramaYUltimoSemestre(String cedulaEstudiante) {
        
        List<Programa> programas = new ArrayList();
        if (cedulaEstudiante.equals(cedulaEstudiante1)) {
            programas.add(new Programa(504, "Ingeniería de Sistemas", "Activo", "2016-1"));
            programas.add(new Programa(104, "Administración de Empresas", "Cancelado", "2016-1"));
        }else{
            if (cedulaEstudiante.equals(cedulaEstudiante2)) {
                programas.add(new Programa(533, "Ingeniería civil", "Activo", "2016-1"));
            }
            // no existe esa cedula en la base de datos
        }
        
        return programas;
    }
    
    
    
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
    public List<Grupo> obtenerGrupos(String codigoMateria) {
        
        List<Grupo> grupos = new ArrayList();
        // hacer una estructura case of codigoMateria
        switch(codigoMateria){
        case "2508107": //LOGICA Y REPRESENTACION I
                grupos.add(new Grupo("01",30,15,"19-220","wv 12-2","juan"));
                grupos.add(new Grupo("02",30,10,"19-310","mj 12-2","maria"));
                break;
            
        case "2508111"://MATEMATICAS DISCRETAS I
                grupos.add(new Grupo("01",30,25,"19-220","wv 6-8","sierra"));
                grupos.add(new Grupo("02",30,25,"19-220","wv 6-8","sierra"));
                break;
        case "2539100"://LECTOESCRITURA
                grupos.add(new Grupo("01",30,30,"19-220","wv 10-12","pepe"));
                grupos.add(new Grupo("02",30,30,"19-222","mj 8-10","yeye"));
                grupos.add(new Grupo("02",30,30,"19-305","mj 8-10","isaza"));
                break;
        case "2536200"://FISICA MECANICA
                grupos.add(new Grupo("01",30,20,"19-207","mj 10-12","arenas bernardo"));
                grupos.add(new Grupo("02",30,15,"19-310","mw 8-10","sarazola"));
                grupos.add(new Grupo("02",30,10,"19-220","mj 2-4","edwar"));
                break;
        case "2517350"://FORMAC CIUDADANA Y CONST.
                grupos.add(new Grupo("01",30,20,"virtual","m 2-4","mariana"));
                grupos.add(new Grupo("02",30,15,"virtual","l 8-10","angelica"));
                grupos.add(new Grupo("02",30,10,"virtual","w 10-12","pedro"));
                break;
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
